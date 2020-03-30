package com.microservice.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: micro-service
 * @description: 方大佬的ribbon
 * @author: ws
 * @create: 2020-03-30 09:51
 **/
@RestController
@RequestMapping("/ribbon")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_HI = "http://microservice-user/hi?name=weishuai";

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return restTemplate.getForObject(URL_HI, String.class);
    }
}
