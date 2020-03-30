package com.microservice.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: micro-service
 * @description: 方大佬的demo
 * @author: ws
 * @create: 2020-03-30 09:19
 **/
@RestController
public class HomeController {


    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "weishuai") String name){
        return "hi: " + name + " i am from port:" + port;
    }

}
