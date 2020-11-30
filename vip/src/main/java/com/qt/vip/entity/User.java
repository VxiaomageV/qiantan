package com.qt.vip.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.qt.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.qt.common.validator.groups.Update;

/**
 * 用户主表
 *
 * @author mal
 * @since 2020-11-30
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "User对象")
public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("真实姓名")
    private String realName;

    @ApiModelProperty("手机号")
    private Integer phone;

    @ApiModelProperty("登录密码")
    private String password;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("个人简介")
    private String userIntro;

    @ApiModelProperty("用户头像地址")
    private String userPortrait;

    @ApiModelProperty("生日")
    private Date birthday;

    @ApiModelProperty("居住地")
    private String address;

    @ApiModelProperty("身份证号")
    private String card;

    @ApiModelProperty("所在院校")
    private String school;

    @ApiModelProperty("院校证明材料图片地址")
    private String certify;

    @ApiModelProperty("状态：1：启用 0：未启用")
    private Boolean isValid;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
