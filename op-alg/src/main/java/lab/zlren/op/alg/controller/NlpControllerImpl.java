package lab.zlren.op.alg.controller;

import com.hankcs.hanlp.HanLP;
import lab.zlren.op.alg.bean.CommonFormatter;
import lab.zlren.op.common.service.NlpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author zlren
 * @date 2017-11-30
 */
@RestController
@RequestMapping("nlp")
@Slf4j
public class NlpControllerImpl implements NlpService {

    @Autowired
    private CommonFormatter commonFormatter;

    @Override
    @PostMapping("text_keywords")
    public String textKeyWords(@RequestBody Map<String, Object> params) {

        String text = (String) params.get("text");
        Integer size = (Integer) params.get("size");

        List<String> keywordList = HanLP.extractKeyword(text, size);

        return commonFormatter.extraction(text, keywordList);
    }

    @Override
    @GetMapping("{name}")
    public String testRestful(@PathVariable String name) {
        log.info("哈哈哈 name收到了{}", name);
        return name;
    }
}
