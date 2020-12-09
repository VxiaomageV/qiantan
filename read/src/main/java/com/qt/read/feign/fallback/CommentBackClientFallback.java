package com.qt.read.feign.fallback;

import com.qt.read.entity.CommentBack;
import com.qt.read.feign.CommentBackClient;
import com.qt.read.query.CommentBackPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 书籍评论回复表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-03
 */
@Slf4j
@Component
public class CommentBackClientFallback implements CommentBackClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加书籍评论回复表
     */
    @Override
    public ApiResult<Boolean> addCommentBack(CommentBack commentBack) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改书籍评论回复表
     */
    @Override
    public ApiResult<Boolean> updateCommentBack(CommentBack commentBack) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除书籍评论回复表
     */
    @Override
    public ApiResult<Boolean> deleteCommentBack(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取书籍评论回复表详情
     */
    @Override
    public ApiResult<CommentBack> getCommentBack(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 书籍评论回复表分页列表
     */
    @Override
    public ApiResult<Paging<CommentBack>> getCommentBackPageList(CommentBackPageQuery commentBackPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
