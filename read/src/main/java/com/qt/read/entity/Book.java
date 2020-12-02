package com.qt.read.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.qt.common.entity.BaseEntity;
import com.qt.common.validator.groups.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 书籍主表表
 *
 * @author mal
 * @since 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Book对象")
public class Book extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
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

    @ApiModelProperty("书籍地址")
    private String bookAddress;

    @ApiModelProperty("书籍类型名称")
    private String bookTypeName;

    @ApiModelProperty("书籍类别 book.推书;magazine.杂志")
    private String bookKind;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
