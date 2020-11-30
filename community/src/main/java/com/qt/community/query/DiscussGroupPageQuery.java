package com.qt.community.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.qt.common.pagination.BasePageOrderQuery;

/**
 * <pre>
 * 讨论组主表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-30
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "讨论组主表分页查询")
public class DiscussGroupPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;
}
