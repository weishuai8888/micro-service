package com.microservice.movie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: micro-service
 * @description: 方大佬的feign
 * @author: ws
 * @create: 2020-03-30 10:15
 **/
@Service
@FeignClient(value = "microservice-user")
public interface HiFeignService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientUser(@RequestParam String name);

}
