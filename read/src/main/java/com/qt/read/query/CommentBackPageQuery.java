package com.qt.read.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.qt.common.pagination.BasePageOrderQuery;

/**
 * <pre>
 * 书籍评论回复表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-03
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "书籍评论回复表分页查询")
public class CommentBackPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;
}
