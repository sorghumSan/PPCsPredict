package med.service;

import med.entity.PPCSelection;
import org.springframework.stereotype.Service;

@Service
public interface PPCPredictService {

    //预测PPCs的发生
    public String predict(PPCSelection selection);

}
