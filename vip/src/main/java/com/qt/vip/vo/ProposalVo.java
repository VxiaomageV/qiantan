package com.qt.vip.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 意见反馈表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-01
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "Proposal对象")
public class ProposalVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("建议内容")
    private String proposalContent;

    @ApiModelProperty("建议图片地址")
    private String proposalPhoto;

    @ApiModelProperty("联系方式")
    private String contact;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}