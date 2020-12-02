package com.qt.read.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 名人名言表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "Saying对象")
public class SayingVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名言作者")
    private String sayingAuthor;

    @ApiModelProperty("名言内容")
    private String sayingContent;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}