package com.microservice.movie.service.impl;

import com.microservice.movie.service.HiFeignService;
import org.springframework.stereotype.Component;

/**
 * @program: micro-service
 * @description: 方大佬的feign集成hystrix
 * @author: ws
 * @create: 2020-03-30 11:05
 **/
@Component
public class HiFeignServiceHystrix implements HiFeignService {


    @Override
    public String sayHiFromClientUser(String name) {
        return "sorry: " + name;
    }
}
