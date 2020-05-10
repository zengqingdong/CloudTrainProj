package com.train.cloud.callback;

import com.train.cloud.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author zengqd
 * @ClassName SchedualServiceHiHystric
 * @Date 2020/5/6 9:59
 * @Version v1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+"服务出现错误";
    }
}
