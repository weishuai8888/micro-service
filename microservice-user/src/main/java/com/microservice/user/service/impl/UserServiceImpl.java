package com.microservice.user.service.impl;

import com.microservice.microservice.module.ResultCode;
import com.microservice.microservice.module.ResultInfo;
import com.microservice.microservice.module.User;
import com.microservice.user.dao.UserMapper;
import com.microservice.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: microservice
 * @description: user service impl
 * @author: ws
 * @create: 2020-03-24 09:21
 **/
@Service
public class UserServiceImpl implements UserService {


    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultInfo findById(long id) {
        ResultInfo resultInfo = new ResultInfo();
        try {
            User user = userMapper.findById(id);
            resultInfo.setCode(ResultCode.R_2000_SUCCESS.getCode());
            resultInfo.setMessage(ResultCode.R_2000_SUCCESS.getReason());
            resultInfo.setResult(user);
        }catch (Exception e) {
            LOGGER.info("UserServiceImpl findById is error!", e);
            resultInfo.setCode(ResultCode.R_4000_FAIL.getCode());
            resultInfo.setMessage(ResultCode.R_4000_FAIL.getReason());
        }
        return resultInfo;
    }
}
