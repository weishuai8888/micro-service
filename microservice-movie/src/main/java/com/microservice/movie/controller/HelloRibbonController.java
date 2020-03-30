package com.microservice.movie.controller;

import com.microservice.movie.service.HiRibbonService;
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
public class HelloRibbonController {

    @Autowired
    private HiRibbonService hiRibbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return hiRibbonService.hiService(name);
    }
}
