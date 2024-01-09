package med.service.impl;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import med.entity.PPCSelection;
import med.service.PPCPredictService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PPCPredictServiceImpl implements PPCPredictService {

    @Value("${flask.url}")
    private String flaskUrl;

    @Override
    public String predict(PPCSelection selection) {
        HashMap<String, Object> paramMap = new HashMap<>();

        paramMap.put("Operative_specialty_location",selection.getOperative_specialty_location());
        paramMap.put("Date_of_operation",selection.getDate());
        paramMap.put("ASA_classification",selection.getAsa());
        paramMap.put("Minimum_of_MP",selection.getMinimum_of_MP());
        paramMap.put("ABO_blood_group",selection.getAbo_blood_group());
        paramMap.put("Laparoscopic_surgery",selection.getLaparoscopic_surgery());
        paramMap.put("AUC_of_CRS",selection.getAuc_of_CRS());
        paramMap.put("Disseminated_cancer",selection.getDisseminated_cancer());
        paramMap.put("Sex",selection.getGender());
        paramMap.put("Functional_status",selection.getFunctional_status());
        paramMap.put("Cardiac_functional_grading_NYHA",selection.getCardiac_functional_grading_NYHA());
        paramMap.put("Longest_stirke_above_mean_value_of_MP",selection.getLongest_stirke_above_mean_value_of_MP());
        paramMap.put("Respiratory_rate_(beats/min)",selection.getRespiratory_rate());
        paramMap.put("Variance_of_ΔP",selection.getVariance_of_P());
        paramMap.put("Minimum_of_CRS",selection.getMinimum_of_CRS());
        paramMap.put("Longest_stirke_above_mean_value_of_CRS",selection.getLongest_stirke_below_mean_value_of_CRS());
        paramMap.put("Longest_stirke_below_mean_value_of_CRS",selection.getLongest_stirke_below_mean_value_of_CRS());
        paramMap.put("Longest_stirke_below_mean_value_of_MP",selection.getLongest_stirke_below_mean_value_of_MP());
        paramMap.put("Hypertension_control",selection.getHypertension_control());
        paramMap.put("Percentage_of_MP_value_exceeding_15%_from_the_mean",selection.getPercentage_of_MP_value_exceeding_15_from_the_mean());

        String result2 = HttpRequest.post(flaskUrl+"/ppcs/predict")
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(paramMap)//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
        JSONObject jsonObject = JSONUtil.parseObj(result2);
        String prob = jsonObject.getStr("prediction");
        return prob;
    }
}
