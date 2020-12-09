package com.qt.read.entity;

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
 * 书籍评论表
 *
 * @author mal
 * @since 2020-12-03
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "BookComment对象")
public class BookComment extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("评论者id")
    private Long commentUserId;

    @ApiModelProperty("评论者昵称")
    private String commentUserNickname;

    @ApiModelProperty("评论者头像地址")
    private String commentUserPortrait;

    @ApiModelProperty("评论标题")
    private String commentTitle;

    @ApiModelProperty("评论内容")
    private String commentContent;

    @ApiModelProperty("评论书籍id")
    private Long bookId;

    @ApiModelProperty("评论点赞数")
    private Integer likeSum;

    @ApiModelProperty("是否匿名 0.否;1.是")
    private Boolean isAnonymity;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
