package com.qt.read.feign.fallback;

import com.qt.read.entity.BookType;
import com.qt.read.feign.BookTypeClient;
import com.qt.read.query.BookTypePageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 书籍类型表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Component
public class BookTypeClientFallback implements BookTypeClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加书籍类型表
     */
    @Override
    public ApiResult<Boolean> addBookType(BookType bookType) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改书籍类型表
     */
    @Override
    public ApiResult<Boolean> updateBookType(BookType bookType) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除书籍类型表
     */
    @Override
    public ApiResult<Boolean> deleteBookType(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取书籍类型表详情
     */
    @Override
    public ApiResult<BookType> getBookType(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 书籍类型表分页列表
     */
    @Override
    public ApiResult<Paging<BookType>> getBookTypePageList(BookTypePageQuery bookTypePageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
