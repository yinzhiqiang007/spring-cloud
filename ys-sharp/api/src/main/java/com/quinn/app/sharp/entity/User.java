package com.quinn.app.sharp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.quinn.app.sharp.entity.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    private byte[] nickName;

    private LocalDateTime createTime;


}
