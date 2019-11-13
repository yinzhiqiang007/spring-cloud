package com.quinn.app.sharp.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.quinn.app.sharp.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 客户用户信息 Mapper 接口
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-11
 */
@DS("slave_1")
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
