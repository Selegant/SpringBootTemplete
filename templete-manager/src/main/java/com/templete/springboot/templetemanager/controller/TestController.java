package com.templete.springboot.templetemanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WT
 * @CreateTime 2018/5/3
 * @Package com.templete.springboot.templetemanager.controller
 **/
@RequestMapping("test")
@RestController
public class TestController {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "{id}/{name}",method = RequestMethod.GET)
    public String test(@PathVariable("id")String id,@PathVariable("name")String name){
        logger.info("id："+id);
        logger.info("name："+name);
        return id+name;
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testController(String id,String name){
//        logger.info("id："+id);
//        logger.info("name："+name);
        return id+name;
    }

}
