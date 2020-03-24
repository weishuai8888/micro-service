package com.microservice.user.service;

import com.microservice.microservice.module.ResultInfo;

/**
 * @program: microservice
 * @description: user service
 * @author: ws
 * @create: 2020-03-24 09:20
 **/
public interface UserService {


    /**
     * 根据ID获取用户信息
     * @param id 主键ID
     * @return
     */
    ResultInfo findById(long id);
}
