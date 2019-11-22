package com.quinn.app.sharp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.quinn"})
@MapperScan("com.quinn.app.sharp.mapper")
@EnableDiscoveryClient
public class SharpApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SharpApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("ys.sharp.jdbc.test2");
        String userAge = applicationContext.getEnvironment().getProperty("ys.sharp.jdbc.test3");
        System.err.println("user name :" + userName + "; age: " + userAge);
//        SpringApplication.run(SharpApplication.class ,args);

    }



}
