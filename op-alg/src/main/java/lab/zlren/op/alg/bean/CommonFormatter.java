package lab.zlren.op.alg.bean;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zlren
 * @date 2017-12-01
 */
@Component
public class CommonFormatter {

    public String extraction(String text, List<String> terms) {
        Map<String, Object> result = new HashMap<>();
        result.put("text", text);
        List<Keyword> beanList = new ArrayList<>();
        for (String term : terms) {
            Keyword bean = new Keyword();
            bean.setItem(term);
            bean.setIndex(text.indexOf(term));
            beanList.add(bean);
        }
        result.put("items", beanList);
        return JSON.toJSONString(result);
    }
}
