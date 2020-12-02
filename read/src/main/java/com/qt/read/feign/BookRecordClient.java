package com.qt.read.feign;

import com.qt.read.entity.BookRecord;
import com.qt.read.feign.factory.BookRecordClientFallbackFactory;
import com.qt.read.query.BookRecordPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 书籍查看记录表 Feign Client
 *
 * @author mal
 * @since 2020-12-02
 */
@FeignClient(name = "read", path = "/bookRecord", fallbackFactory = BookRecordClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface BookRecordClient {

    /**
     * 添加书籍查看记录表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addBookRecord(@RequestBody BookRecord bookRecord) throws Exception;

    /**
     * 修改书籍查看记录表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateBookRecord(@RequestBody BookRecord bookRecord) throws Exception;

    /**
     * 删除书籍查看记录表
     */
    ApiResult<Boolean> deleteBookRecord(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取书籍查看记录表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<BookRecord> getBookRecord(@PathVariable("id") Long id) throws Exception;

    /**
     * 书籍查看记录表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<BookRecord>> getBookRecordPageList(@RequestBody BookRecordPageQuery bookRecordPageQuery) throws Exception;

}
