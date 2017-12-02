package lab.zlren.op.alg.util;

import com.alibaba.fastjson.JSON;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Controller测试工具
 *
 * @author zlren
 * @date 2017-12-01
 */
public class ControllerTestUtil {

    /**
     * 测试post方法
     *
     * @param mockMvc mockMvc实例
     * @param url     被测试的url
     * @param params  参数组成的map
     * @return 返回值
     * @throws Exception 异常
     */
    public static String testPost(MockMvc mockMvc, String url, Map<String, Object> params) throws Exception {
        return mockMvc.perform(post(url).contentType(MediaType.APPLICATION_JSON_UTF8).content
                (JSON.toJSONString(params))).andReturn().getResponse().getContentAsString();
    }
}
