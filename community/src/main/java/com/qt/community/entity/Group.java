package com.qt.community.entity;

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
 * 讨论组主表
 *
 * @author mal
 * @since 2020-11-30
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Group对象")
public class Group extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
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
