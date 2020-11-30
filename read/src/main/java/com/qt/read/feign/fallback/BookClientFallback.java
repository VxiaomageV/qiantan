package com.qt.read.feign.fallback;

import com.qt.read.entity.Book;
import com.qt.read.feign.BookClient;
import com.qt.read.query.BookPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 书籍主表表 Feign Fallback
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Component
public class BookClientFallback implements BookClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加书籍主表表
     */
    @Override
    public ApiResult<Boolean> addBook(Book book) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改书籍主表表
     */
    @Override
    public ApiResult<Boolean> updateBook(Book book) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除书籍主表表
     */
    @Override
    public ApiResult<Boolean> deleteBook(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取书籍主表表详情
     */
    @Override
    public ApiResult<Book> getBook(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 书籍主表表分页列表
     */
    @Override
    public ApiResult<Paging<Book>> getBookPageList(BookPageQuery bookPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
