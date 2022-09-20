package cn.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KleiRegistry1 {
    public static void main(String[] args) {
        SpringApplication.run(KleiRegistry1.class);
    }
}
