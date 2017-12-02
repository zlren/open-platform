package lab.zlren.op.common.service;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 这是公共接口，客户端（feign）直接用一个的接口继承此接口并加上@FeignClient注解，在服务提供者那里用一个Controller去实现这个接口，这样可以简化Feign的开发
 * 但是带来的另一个坏处就是耦合了。。
 *
 * @author zlren
 * @date 2017-12-01
 */
public interface NlpService {

    /**
     * 提取关键词
     *
     * @param params 需要提供的参数text和size
     * @return 关键词列表
     */
    @RequestMapping(value = "/nlp/text_keywords", method = RequestMethod.POST)
    String textKeyWords(@RequestBody Map<String, Object> params);

    /**
     * 测试一下
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/nlp/{name}", method = RequestMethod.GET)
    String testRestful(@PathVariable("name") String name);
}
