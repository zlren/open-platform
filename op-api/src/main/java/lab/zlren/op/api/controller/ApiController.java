package lab.zlren.op.api.controller;

import lab.zlren.op.api.feign.AlgFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlren
 * @date 2017-11-30
 */
@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    private AlgFeignClient algFeignClient;

    @GetMapping("test")
    public String test() {
        String test = algFeignClient.test();
        return test;
    }

}
