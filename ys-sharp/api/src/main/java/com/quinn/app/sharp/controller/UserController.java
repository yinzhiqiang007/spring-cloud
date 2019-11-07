package com.quinn.app.sharp.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.quinn.app.common.util.CommonUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @ApolloConfig
    private Config config;

    @Value("${ys.sharp.jdbc.username}")
    private String test1;

    @Value("${ys.sharp.oss.buc}")
    private String buc;
    @RequestMapping("test")
    public String test(){
        String test = this.config.getProperty("ys.sharp.jdbc.username","sss");
        System.out.println(test);
        System.out.println(test1);
        System.out.println(buc);
        return "sdf234水电费"+new Date();
    }
}
