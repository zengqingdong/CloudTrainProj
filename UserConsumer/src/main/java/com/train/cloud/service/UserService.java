package com.train.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zengqd
 * @ClassName UserService
 * @Date 2020/5/5 20:00
 * @Version v1.0
 **/
@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://userservice/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,服务出现异常!";
    }
}
