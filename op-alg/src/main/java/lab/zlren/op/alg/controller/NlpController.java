package lab.zlren.op.alg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlren
 * @date 2017-11-30
 */
@RestController
@RequestMapping("test")
public class NlpController {

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }
}
