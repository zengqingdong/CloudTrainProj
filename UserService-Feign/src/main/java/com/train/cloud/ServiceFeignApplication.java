package com.train.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author zengqd
 * @ClassName ServiceFeignApplication
 * @Date 2020/5/6 7:48
 * @Version v1.0
 **/
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
