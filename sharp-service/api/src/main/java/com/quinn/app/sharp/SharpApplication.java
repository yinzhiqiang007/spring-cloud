package com.quinn.app.sharp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Date;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
public class SharpApplication {

    public static void main1(String[] args) {
//        SpringApplication.run(ApiApplication.class ,args);

        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        LocalDateTime l  = LocalDateTime.now();

//        DateTimeFormatter formatter = new DateTimeFormatter("yyyyMMdd");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMdd");

        System.out.println(formatter1.format(l));




    }

    public static void main(String[] args) throws ParseException {
//        Long s1 = System.currentTimeMillis();
//        System.out.println(s1);
//        Long s = 1557804596000l;

        System.out.println(System.currentTimeMillis());
        Long s = 1558370389000l;
//        System.out.println(s1-s);
        Date date = new Date(s);
        System.out.println(date.toString());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sDate = df.format(date);
        System.out.println(sDate);

        String star = "2019-05-20 00:00:00";
        String end = "2019-05-14 23:59:59";
        Date date1 = df.parse(star);
        Date date2 = df.parse(end);
        System.out.println(date1.toInstant().getEpochSecond());
        System.out.println(date1.getTime());


        System.out.println(date2.toInstant().getEpochSecond());
        System.out.println(date2.getTime());


//        System.out.println(String.format("ddd"+"/%s/%s/index.m3u8", 123l));


    }


}
