package com.quinn.app.sharp.entity;

import com.quinn.app.sharp.entity.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 客户用户信息
 * </p>
 *
 * @author yinzhiqiang
 * @since 2019-11-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * sys_user表ID
     */
    private Long sysUserId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * openid
     */
    private String wxOpenid;

    /**
     * 推荐人
     */
    private Long extendUserId;

    /**
     * 首次消费门店ID
     */
    private Long extendShopId;

    /**
     * 头像
     */
    private String photoUrl;

    /**
     * 描述
     */
    private String memo;

    /**
     * 积分
     */
    private Integer bonusAmount;

    /**
     * 锁定积分
     */
    private Integer bonusLocked;

    /**
     * 会员状态
     */
    private Integer status;

    /**
     * 是否关注
     */
    private Integer subAttebtion;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 最后创建名称
     */
    private Long createrId;

    /**
     * 最后修改用户名称
     */
    private Long updaterId;

    /**
     * 最后创建名称
     */
    private String createrName;

    /**
     * 最后修改用户名称
     */
    private String updaterName;

    /**
     * 1表示微信，2表示支付宝生活号
     */
    private Integer platType;

    /**
     * 否是参加了关注送活动
     */
    private Integer subActivityFag;

    /**
     * 推广
     */
    private Integer extendActivityFlag;

    /**
     * 分享记录id
     */
    private Long userShareId;

    /**
     * 会员卡号
     */
    private String userCardNo;

    /**
     * 小程序openid
     */
    private String miniOpenid;

    /**
     * 微信用户关联唯一id
     */
    private String wxUnionId;


}
