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
 * 书籍类型表
 *
 * @author mal
 * @since 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "BookType对象")
public class BookType extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "id不能为空", groups = {Update.class})
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("类型名称")
    private String typeName;

    @ApiModelProperty("类型简介")
    private String typeIntro;

    @ApiModelProperty("类型图片地址")
    private String typeImage;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
