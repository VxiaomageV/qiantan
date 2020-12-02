package com.qt.read.query;

import com.qt.common.pagination.BasePageOrderQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <pre>
 * 书籍查看记录表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-02
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "书籍查看记录表分页查询")
public class BookRecordPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    private Long userId;
}
