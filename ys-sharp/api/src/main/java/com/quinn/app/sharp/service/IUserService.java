package com.quinn.app.sharp.service;

import com.quinn.app.sharp.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-08
 */
public interface IUserService extends IService<User> {

    public List<User> getUser();

}
