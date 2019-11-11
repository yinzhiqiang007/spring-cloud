package com.quinn.app.sharp.controller;


import com.quinn.app.sharp.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.quinn.app.sharp.controller.BaseController;

/**
 * <p>
 * 客户用户信息 前端控制器
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/sharp/user-info")
public class UserInfoController extends BaseController {

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping("getUser")
    public Object getUser(){
        return this.userInfoService.getById(2);
    }

}
