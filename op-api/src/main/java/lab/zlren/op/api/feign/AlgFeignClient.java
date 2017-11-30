package lab.zlren.op.api.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zlren
 */
@FeignClient(name = "open-platform-alg")
public interface AlgFeignClient {

    /**
     * 根据id查找用户信息
     * 注意两点 1是必须RequestMapping而不能GetMapping 2是@PathVariable("id")里面的id不能省略
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/test/hello", method = RequestMethod.GET)
    String test();
}
