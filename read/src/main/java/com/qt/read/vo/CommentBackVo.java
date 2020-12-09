package com.qt.read.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 书籍评论回复表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-03
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "CommentBack对象")
public class CommentBackVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("书籍评论id")
    private Long bookCommentId;

    @ApiModelProperty("回复用户id")
    private Long userId;

    @ApiModelProperty("回复用户昵称")
    private String backUserNickname;

    @ApiModelProperty("回复用户头像地址")
    private String backUserPortrait;

    @ApiModelProperty("回复内容")
    private String backContent;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}