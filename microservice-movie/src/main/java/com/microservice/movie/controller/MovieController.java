package com.microservice.movie.controller;

import com.microservice.microservice.module.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String FIND_BY_ID_URL = "http://127.0.0.1:8000/";

    @GetMapping("/user/{id}")
    public ResultInfo findById(@PathVariable long id){
        ResultInfo resultInfo = restTemplate.getForObject(FIND_BY_ID_URL + id, ResultInfo.class);
        return resultInfo;
    }

    /*** 
    * @Description: 查询user服务的信息并返回
    * @Param: [] 
    * @return: java.util.List<org.springframework.cloud.client.ServiceInstance> 
    * @Author: ws 
    * @Date: 2020/3/27 
    */
    @GetMapping("/user_instance")
    public List<ServiceInstance> showInfo(){
        return discoveryClient.getInstances("microservice-user");
    }

}
