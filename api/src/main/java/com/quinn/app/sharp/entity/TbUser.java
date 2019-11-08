package com.quinn.app.sharp.entity;

import java.time.LocalDateTime;
import com.baomidou.ant.common.BaseEntity;
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
public class TbUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    private byte[] nickName;

    private LocalDateTime createTime;


}
