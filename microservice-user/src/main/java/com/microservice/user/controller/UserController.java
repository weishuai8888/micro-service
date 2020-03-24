package com.microservice.user.controller;

import com.microservice.user.module.ResultCode;
import com.microservice.user.module.ResultInfo;
import com.microservice.user.module.User;
import com.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservice
 * @description: user controller
 * @author: ws
 * @create: 2020-03-23 17:38
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResultInfo findById(@PathVariable Long id){
        ResultInfo resultInfo = userService.findById(id);
        return resultInfo;
    }

}
