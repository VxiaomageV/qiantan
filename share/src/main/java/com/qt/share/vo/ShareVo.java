package com.qt.share.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 分享主表 查询结果对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-30
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "Share对象")
public class ShareVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("分享标题")
    private String shareTitle;

    @ApiModelProperty("分享内容")
    private String shareContent;

    @ApiModelProperty("分享感悟")
    private String shareSum;

    @ApiModelProperty("分享类型 1.故事；2.随笔")
    private Integer shareType;

    @ApiModelProperty("分享作者")
    private Long shareAuthorId;

    @ApiModelProperty("点赞数量")
    private Integer likeNum;

    @ApiModelProperty("所属话题id")
    private Long topicId;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}