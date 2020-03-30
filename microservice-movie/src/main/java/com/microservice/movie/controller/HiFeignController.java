package com.microservice.movie.controller;

import com.microservice.movie.service.HiFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: micro-service
 * @description: 方大佬的feign
 * @author: ws
 * @create: 2020-03-30 10:20
 **/
@RestController
@RequestMapping("/feign")
public class HiFeignController {

    @Autowired
    private HiFeignService hiFeignService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return hiFeignService.sayHiFromClientUser(name);
    }

}
