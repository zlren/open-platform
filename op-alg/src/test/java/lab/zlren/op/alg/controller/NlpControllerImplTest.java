package lab.zlren.op.alg.controller;

import lab.zlren.op.alg.util.ControllerTestUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class NlpControllerImplTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void textKeyWords() throws Exception {

        Map<String, Object> params = new HashMap<>();
        params.put("text", "今天天气是真不错");
        params.put("size", 1);

        log.error("哈哈哈哈 {}", ControllerTestUtil.testPost(mockMvc, "/nlp/text_keywords", params));
    }
}
