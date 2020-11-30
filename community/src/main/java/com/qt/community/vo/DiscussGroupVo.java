package com.qt.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 讨论组主表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-30
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "DiscussGroup对象")
public class DiscussGroupVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("讨论组名字")
    private String groupName;

    @ApiModelProperty("讨论组简介")
    private String groupIntro;

    @ApiModelProperty("讨论组头像地址")
    private String groupPortrait;

    @ApiModelProperty("讨论组类别id")
    private Long groupId;

    @ApiModelProperty("讨论组类别名称")
    private String groupTypeName;

    @ApiModelProperty("创建人昵称")
    private String creatorNickname;

    @ApiModelProperty("创建人电话")
    private Integer creatorPhone;

    @ApiModelProperty("状态：1：启用 0：未启用")
    private Boolean isValid;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}