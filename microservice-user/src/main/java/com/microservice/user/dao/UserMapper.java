package com.microservice.user.dao;

import com.microservice.user.module.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: microservice
 * @description: user的dao层
 * @author: ws
 * @create: 2020-03-23 17:32
 **/
@Repository
@Mapper
public interface UserMapper {
    /**
     * 根据ID获取用户信息
     * @param id 主键
     * @return
     */
    User findById(long id);
}
