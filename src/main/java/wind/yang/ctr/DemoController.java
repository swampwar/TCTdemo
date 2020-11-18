package wind.yang.ctr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wind.yang.dto.DemoDto;
import wind.yang.dto.SearchCondition;
import wind.yang.svc.DemoService;

@Slf4j
@Controller
public class DemoController {
    @Autowired
    DemoService demoService;

    @ResponseBody
    @PostMapping("/search")
    public DemoDto search(@RequestBody SearchCondition sCondition) {
        log.debug("search : {}", sCondition);
        return demoService.getDemoByName(sCondition.getKeyword());
    }
}
