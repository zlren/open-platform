package lab.zlren.op.api.feign;

import lab.zlren.op.common.service.NlpService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author zlren
 */
@FeignClient(name = "open-platform-alg")
public interface AlgFeignClient extends NlpService {

}
