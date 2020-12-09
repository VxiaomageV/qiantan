package com.qt.read.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 书籍评论表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-03
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "BookComment对象")
public class BookCommentVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
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