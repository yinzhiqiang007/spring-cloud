package com.quinn.app.sharp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
@ServletComponentScan
@ComponentScan(basePackages = {"com.quinn"})
public class SharpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharpApplication.class ,args);

    }



}
