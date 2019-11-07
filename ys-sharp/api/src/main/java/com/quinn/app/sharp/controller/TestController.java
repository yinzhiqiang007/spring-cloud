package com.quinn.app.sharp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("test")
public class TestController {

    @RequestMapping("/t1")
    public String test(){
        return "dsfsd是的范德萨"+new Date();
    }
}
