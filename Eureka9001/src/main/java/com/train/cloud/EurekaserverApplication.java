package com.train.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author zengqd
 * @ClassName EurekaserverApplication
 * @Date 2020/5/5 15:55
 * @Version v1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {

    public static void main(String[] args) {
        System.out.println("branch1");
        System.out.println("这真的是分支1创建的内容");
        SpringApplication.run(EurekaserverApplication.class, args);
    }
}
