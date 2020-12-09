package com.qt.read.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.qt.common.pagination.BasePageOrderQuery;

/**
 * <pre>
 * 书籍评论表 分页查询对象
 * </pre>
 *
 * @author mal
 * @date 2020-12-03
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "书籍评论表分页查询")
public class BookCommentPageQuery extends BasePageOrderQuery {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("评论书籍id")
    private Long bookId;
}
