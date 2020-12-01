package com.qt.vip.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.qt.common.pagination.BasePageOrderQuery;

/**
 * <pre>
 * 粉丝表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "粉丝表分页查询")
public class FansPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("关注的用户id")
    private Long fansId;


}
