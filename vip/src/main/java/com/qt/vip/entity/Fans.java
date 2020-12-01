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
 * 粉丝表
 *
 * @author mal
 * @since 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Fans对象")
public class Fans extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("用户个人简介")
    private String userIntro;

    @ApiModelProperty("用户头像地址")
    private String userPortrait;

    @ApiModelProperty("关注的用户id")
    private Long fansId;

    @ApiModelProperty("关注的用户昵称")
    private String fansNickname;

    @ApiModelProperty("关注的用户个人简介")
    private String fansIntro;

    @ApiModelProperty("关注的用户头像地址")
    private String fansPortrait;

    @ApiModelProperty("状态：1：启用 0：未启用")
    private Boolean isValid;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
