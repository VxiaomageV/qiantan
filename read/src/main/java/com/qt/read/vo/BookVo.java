package com.qt.read.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 书籍主表表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-30
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "Book对象")
public class BookVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

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

    @ApiModelProperty("书籍类型")
    private String bookTypeId;

    @ApiModelProperty("书籍类别 book.推书;magazine.杂志")
    private String bookKind;

    @ApiModelProperty("在线阅读人基数")
    private Integer bookReadSum;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}