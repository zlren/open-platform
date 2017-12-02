package lab.zlren.op.api.controller;

import lab.zlren.op.api.feign.AlgFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author zlren
 * @date 2017-11-30
 */
@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    private AlgFeignClient algFeignClient;

    @PostMapping("nlp/text_keywords")
    public String textKeywords(@RequestBody Map<String, Object> params) {
        return algFeignClient.textKeyWords(params);
    }

    @GetMapping("nlp/{name}")
    public String test(@PathVariable String name) {
        return algFeignClient.testRestful(name);
    }

}
