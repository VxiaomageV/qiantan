package com.qt.vip.user.query;

import com.qt.common.pagination.BasePageOrderQuery;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

;

/**
 * <pre>
 * 用户主表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-26
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户主表分页查询")
public class UserPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;
}
