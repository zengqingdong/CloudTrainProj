package com.train.cloud.controller;

import com.train.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zengqd
 * @ClassName UserController
 * @Date 2020/5/5 20:08
 * @Version v1.0
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return userService.hiService(name);
    }
}
