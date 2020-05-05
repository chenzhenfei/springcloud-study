package com.study.serviceremeber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2
@EnableDiscoveryClient
public class ServiceRemeberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRemeberApplication.class, args);
    }
}
