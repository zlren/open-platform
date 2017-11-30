package lab.zlren.op.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zlren
 * @date 2017-11-30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OpenPlatformApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenPlatformApiApplication.class, args);
    }
}
