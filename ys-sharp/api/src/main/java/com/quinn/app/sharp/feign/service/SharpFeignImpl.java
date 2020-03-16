package com.quinn.app.sharp.feign.service;

import com.quinn.app.sharp.feign.SharpFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SharpFeignImpl implements SharpFeign {
    @Override
    public String hello(String name) {
        return null;
    }
}
