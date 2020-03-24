package com.microservice.user.service;

import com.microservice.user.module.ResultInfo;
import com.microservice.user.module.User;

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
