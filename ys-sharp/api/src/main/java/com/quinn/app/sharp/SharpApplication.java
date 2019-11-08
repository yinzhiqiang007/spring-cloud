package com.quinn.app.sharp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.quinn"})
@MapperScan("com.quinn.app.sharp.mapper")
public class SharpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharpApplication.class ,args);

    }



}
