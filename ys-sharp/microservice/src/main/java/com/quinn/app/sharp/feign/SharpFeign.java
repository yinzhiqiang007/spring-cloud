package com.quinn.app.sharp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sharpFeignProvider")
public interface SharpFeign {

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;
}
