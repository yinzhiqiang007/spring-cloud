package com.quinn.app.sharp.controller;


import com.quinn.app.sharp.entity.User;
import com.quinn.app.sharp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.quinn.app.sharp.controller.BaseController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-08
 */
@RestController
@RequestMapping("/sharp/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("getUesr")
    public List<User> getUser(){
        return userService.getUser();
    }

}
