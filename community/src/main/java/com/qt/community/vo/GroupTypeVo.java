package com.qt.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 讨论组类型表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-30
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "GroupType对象")
public class GroupTypeVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("类型名称")
    private String typeName;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}