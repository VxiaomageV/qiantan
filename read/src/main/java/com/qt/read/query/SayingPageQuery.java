package com.qt.read.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.qt.common.pagination.BasePageOrderQuery;

/**
 * <pre>
 * 名人名言表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "名人名言表分页查询")
public class SayingPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;
}
