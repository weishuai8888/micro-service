package com.microservice.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: micro-service
 * @description: 方大佬的ribbon
 * @author: ws
 * @create: 2020-03-30 10:44
 **/
public interface HiRibbonService {

    String hiService(String name);
}
