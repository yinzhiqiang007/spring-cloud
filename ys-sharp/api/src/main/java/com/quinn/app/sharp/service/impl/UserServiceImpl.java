package com.quinn.app.sharp.service.impl;

import com.quinn.app.common.constans.ResponseData;
import com.quinn.app.common.constans.ResponseEnum;
import com.quinn.app.sharp.entity.User;
import com.quinn.app.sharp.mapper.UserMapper;
import com.quinn.app.sharp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public ResponseData getUser(){
        return ResponseEnum.code_000000.result(this.baseMapper.selectList(null));
    }

    @Override
    public ResponseData getUserById(Long id) {
        return ResponseEnum.code_000000.result(userMapper.getUserById(id));
    }

}
