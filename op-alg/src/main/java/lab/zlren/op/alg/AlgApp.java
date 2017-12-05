package lab.zlren.op.alg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zlren
 * @date 2017-11-30
 */
@SpringBootApplication
@EnableEurekaClient
public class AlgApp {

    public static void main(String[] args) {
        SpringApplication.run(AlgApp.class, args);
    }
}
