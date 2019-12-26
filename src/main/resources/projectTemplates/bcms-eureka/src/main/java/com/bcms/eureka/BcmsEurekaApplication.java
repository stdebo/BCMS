package com.bcms.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BcmsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BcmsEurekaApplication.class, args);
    }

}
