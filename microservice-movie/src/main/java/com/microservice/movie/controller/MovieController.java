package com.microservice.movie.controller;

import com.microservice.microservice.module.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: micro-service
 * @description: 调用用户微服务
 * @author: ws
 * @create: 2020-03-24 14:27
 **/
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String FIND_BY_ID_URL = "http://127.0.0.1:8000/";

    @GetMapping("/user/{id}")
    public ResultInfo findById(@PathVariable long id){
        ResultInfo resultInfo = restTemplate.getForObject(FIND_BY_ID_URL + id, ResultInfo.class);
        return resultInfo;
    }

}
