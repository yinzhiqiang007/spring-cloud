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
        for(String s:args){
            System.out.println("args:"+s);
        }
        String namespace = "082d82fe-e42f-44d4-ab3c-4dc888a784d3";

        System.setProperty("spring.cloud.nacos.config.namespace",namespace);
        System.setProperty("spring.cloud.nacos.discovery.namespace",namespace);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SharpApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("ys.sharp.jdbc.test2");
        String userAge = applicationContext.getEnvironment().getProperty("ys.sharp.jdbc.test3");
        System.out.println(applicationContext.getEnvironment().getProperty("spring.cloud.nacos.config.namespace"));
        System.err.println("user name :" + userName + "; age: " + userAge);
//        SpringApplication.run(SharpApplication.class ,args);

    }



}
