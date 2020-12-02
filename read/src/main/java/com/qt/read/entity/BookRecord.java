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
 * 书籍查看记录表
 *
 * @author mal
 * @since 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "BookRecord对象")
public class BookRecord extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
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
