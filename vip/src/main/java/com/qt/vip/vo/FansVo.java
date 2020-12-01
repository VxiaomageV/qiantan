package com.qt.vip.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 粉丝表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "Fans对象")
public class FansVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
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