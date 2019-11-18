package com.quinn.app.sharp.service;

import com.quinn.app.common.constans.ResponseData;
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

    ResponseData getUser();
    ResponseData getUserById(Long id );

}
