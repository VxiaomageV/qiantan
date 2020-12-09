package com.qt.read.feign.fallback;

import com.qt.read.entity.BookComment;
import com.qt.read.feign.BookCommentClient;
import com.qt.read.query.BookCommentPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 书籍评论表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-03
 */
@Slf4j
@Component
public class BookCommentClientFallback implements BookCommentClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加书籍评论表
     */
    @Override
    public ApiResult<Boolean> addBookComment(BookComment bookComment) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改书籍评论表
     */
    @Override
    public ApiResult<Boolean> updateBookComment(BookComment bookComment) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除书籍评论表
     */
    @Override
    public ApiResult<Boolean> deleteBookComment(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取书籍评论表详情
     */
    @Override
    public ApiResult<BookComment> getBookComment(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 书籍评论表分页列表
     */
    @Override
    public ApiResult<Paging<BookComment>> getBookCommentPageList(BookCommentPageQuery bookCommentPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
