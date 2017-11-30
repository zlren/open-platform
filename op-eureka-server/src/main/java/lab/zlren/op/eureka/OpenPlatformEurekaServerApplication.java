package lab.zlren.op.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现中心
 *
 * @author zlren
 * @date 2017-11-30
 */
@SpringBootApplication
@EnableEurekaServer
public class OpenPlatformEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenPlatformEurekaServerApplication.class, args);
    }
}
