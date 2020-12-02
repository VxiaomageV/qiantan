package com.qt.read.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 书籍收藏表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "BookCollect对象")
public class BookCollectVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("书籍id")
    private Long bookId;

    @ApiModelProperty("书籍名称")
    private String bookName;

    @ApiModelProperty("书籍封面地址")
    private String bookCover;

    @ApiModelProperty("书籍已阅比例")
    private Float bookOver;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}