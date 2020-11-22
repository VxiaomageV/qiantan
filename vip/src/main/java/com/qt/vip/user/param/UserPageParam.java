package com.qt.vip.user.param;

import com.qt.core.pagination.BasePageOrderParam;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <pre>
 * 用户主表 分页参数对象
 * </pre>
 *
 * @author mal
 * @date 2020-11-21
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户主表分页参数")
public class UserPageParam extends BasePageOrderParam {
    private static final long serialVersionUID = 1L;
}
