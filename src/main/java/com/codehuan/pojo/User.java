package com.codehuan.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
@Getter
@Setter
@ToString
@TableName("t_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @TableId("id")
    private String id;

    @ApiModelProperty("工号")
    @TableField("workcode")
    private String workcode;

    @ApiModelProperty("头像")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("盐值")
    @TableField("sale")
    private String sale;

    @ApiModelProperty("登录ip")
    @TableField("ip")
    private String ip;

    @ApiModelProperty("登录时间")
    @TableField("login_time")
    private LocalDateTime loginTime;

    @ApiModelProperty("创建日期")
    @TableField("created_time")
    private LocalDateTime createdTime;

    @ApiModelProperty("密码修改日期")
    @TableField("pwd_updated_date")
    private LocalDateTime pwdUpdatedDate;

    @ApiModelProperty("用户修改日期")
    @TableField("updated_time")
    private LocalDateTime updatedTime;

    @ApiModelProperty("性别")
    @TableField("sex")
    private Integer sex;

    @ApiModelProperty("手机号")
    @TableField("phone_number")
    private String phoneNumber;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("QQ")
    @TableField("qq")
    private String qq;

    @ApiModelProperty("微信")
    @TableField("wx")
    private String wx;

    @ApiModelProperty("状态")
    @TableField("wx")
    private String status;
}
