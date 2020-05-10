package com.train.cloud.service;

import com.train.cloud.callback.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zengqd
 * @ClassName SchedualServiceHi
 * @Date 2020/5/6 8:36
 * @Version v1.0
 **/
@FeignClient(value ="userservice",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
