package com.qt.read.feign.fallback;

import com.qt.read.entity.BookRecord;
import com.qt.read.feign.BookRecordClient;
import com.qt.read.query.BookRecordPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 书籍查看记录表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Component
public class BookRecordClientFallback implements BookRecordClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加书籍查看记录表
     */
    @Override
    public ApiResult<Boolean> addBookRecord(BookRecord bookRecord) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改书籍查看记录表
     */
    @Override
    public ApiResult<Boolean> updateBookRecord(BookRecord bookRecord) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除书籍查看记录表
     */
    @Override
    public ApiResult<Boolean> deleteBookRecord(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取书籍查看记录表详情
     */
    @Override
    public ApiResult<BookRecord> getBookRecord(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 书籍查看记录表分页列表
     */
    @Override
    public ApiResult<Paging<BookRecord>> getBookRecordPageList(BookRecordPageQuery bookRecordPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
