package com.qt.read.feign.fallback;

import com.qt.read.entity.BookCollect;
import com.qt.read.feign.BookCollectClient;
import com.qt.read.query.BookCollectPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 书籍收藏表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Component
public class BookCollectClientFallback implements BookCollectClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加书籍收藏表
     */
    @Override
    public ApiResult<Boolean> addBookCollect(BookCollect bookCollect) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改书籍收藏表
     */
    @Override
    public ApiResult<Boolean> updateBookCollect(BookCollect bookCollect) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除书籍收藏表
     */
    @Override
    public ApiResult<Boolean> deleteBookCollect(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取书籍收藏表详情
     */
    @Override
    public ApiResult<BookCollect> getBookCollect(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 书籍收藏表分页列表
     */
    @Override
    public ApiResult<Paging<BookCollect>> getBookCollectPageList(BookCollectPageQuery bookCollectPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
