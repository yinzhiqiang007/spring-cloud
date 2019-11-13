package com.quinn.app.sharp.service.impl;

import com.quinn.app.sharp.entity.UserInfo;
import com.quinn.app.sharp.mapper.UserInfoMapper;
import com.quinn.app.sharp.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户用户信息 服务实现类
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-11
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

}
