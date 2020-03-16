package com.quinn.app.sharp.feign;


//@FeignClient("sharpFeignProvider")
public interface SharpFeign {

//    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    String hello( String name) ;
}
