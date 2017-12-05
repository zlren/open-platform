package lab.zlren.op.mis.controller;

import lab.zlren.op.mis.entity.User;
import lab.zlren.op.mis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlren
 * @date 2017-12-05
 */
@RestController
@RequestMapping("mis")
@Slf4j
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String testController() {

        User user = new User().setPassword("123456").setRole("管理员").setAvatarFile("lgjljlfa");
        log.info("{}", user);

        userService.insert(user);

        return "hello";
    }
}
