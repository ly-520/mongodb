package com.mongodb.mongodb.service.impl;

import com.mongodb.mongodb.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author ljt
 * @Title: TestServiceImpl
 * @ProjectName mongodb
 * @Description:
 * @Version:
 * @date 2020/1/3 13:20
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    public String getTest() {
        Integer type= null;
        System.out.println(type/20);
        return "test!!!";
    }
}
