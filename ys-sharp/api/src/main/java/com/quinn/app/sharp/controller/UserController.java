package com.quinn.app.sharp.controller;


import com.alibaba.fastjson.JSON;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.quinn.app.common.constans.ResponseData;
import com.quinn.app.sharp.entity.User;
import com.quinn.app.sharp.redis.IRedisService;
import com.quinn.app.sharp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.quinn.app.sharp.controller.BaseController;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-08
 */
@RestController
@RequestMapping("/sharp/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @ApolloConfig
    private Config config;

    @Autowired
    private IRedisService systemConfigRedisService;


    @RequestMapping("getUser")

    public Object getUser(){
        systemConfigRedisService.setStr("ddddd","ddddddddddddddddddd",200);

        Set<String> stringSet =  config.getPropertyNames();
        stringSet.stream().forEach(a ->{
            System.out.println(a);
        });

        String s1 = config.getProperty("ys.sharp.oss.buc","ddds1");
        System.out.println(s1);
        String s = config.getProperty("mybatis-plus.mapper-locations","dddss");
        String s2 = config.getProperty("spring.datasource.dynamic.datasource.master.url","s2");
        String s4 = config.getProperty("spring.datasource.dynamic.datasource.master.url","master");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s4);
        ResponseData user = this.userService.getUserById(1l);
        System.out.println(JSON.toJSONString(user));


        return userService.getUser();
//        return user;
    }

}
