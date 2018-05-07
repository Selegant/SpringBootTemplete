package com.templete.springboot.templetemanager.controller;

import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WT
 * @CreateTime 2018/5/3
 * @Package com.templete.springboot.templetemanager.controller
 **/
@RequestMapping("login")
@RestController
public class LoginController {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "{id}/{name}",method = RequestMethod.GET)
    public String test(@PathVariable("id")String id,@PathVariable("name")String name){
        logger.info("id："+id);
        logger.info("name："+name);
        return id+name;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JSONObject testController(String username,String password){
        Map<String,Object>  admin=new HashMap<>();
        admin.put("roles","admin");
        admin.put("token","admin");
        admin.put("introduction","我是超级管理员");
        admin.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        admin.put("name","Super Admin");
        return JSONObject.fromObject(admin);
    }

}
