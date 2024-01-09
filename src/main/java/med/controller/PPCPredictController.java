// LoginController.java
package med.controller;
import med.entity.PPCSelection;
import med.entity.Result;
import med.service.PPCPredictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PPCPredictController {

    @Autowired
    private PPCPredictService ppcPredictService;

    //术后肺部并发症的预测
    @PostMapping("/processSurgerySelection")
    public Result processSurgerySelection(@RequestBody PPCSelection selection) {
        String prob = ppcPredictService.predict(selection);
        return Result.success(prob);
    }
}
