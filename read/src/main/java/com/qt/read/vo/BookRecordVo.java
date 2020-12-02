package com.qt.read.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 书籍查看记录表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "BookRecord对象")
public class BookRecordVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("书籍id")
    private Long bookId;

    @ApiModelProperty("书籍名称")
    private String bookName;

    @ApiModelProperty("书籍作者")
    private String bookAuthor;

    @ApiModelProperty("书籍简介")
    private String bookIntro;

    @ApiModelProperty("在读人数")
    private Integer readNumber;

    @ApiModelProperty("书籍封面地址")
    private String bookCover;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}