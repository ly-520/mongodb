package com.mongodb.mongodb.controller;

import com.mongodb.mongodb.dao.MongoTestDao;
import com.mongodb.mongodb.model.MongoTest;
import com.mongodb.mongodb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljt
 * @Title: MongodbController
 * @ProjectName mongodb
 * @Description:
 * @Version:
 * @date 2020/1/2 13:23
 */
@RestController
public class MongodbController {

    @Autowired
    private MongoTestDao mtdao;

    @GetMapping(value="/test1")
    public void saveTest() throws Exception {
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }

    @GetMapping(value="/test2")
    public MongoTest findTestByName(){
        MongoTest mgtest= mtdao.findTestByName("ceshi");
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }

    @GetMapping(value="/test3")
    public void updateTest(){
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value="/test4")
    public void deleteTestById(){
        mtdao.deleteTestById(11);
    }


    @Autowired
    private TestService testService;
    @GetMapping(value = "/test")
    public String test(){
        String  s = testService.getTest();
        return  s;
    }

}
