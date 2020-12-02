package com.qt.read.feign;

import com.qt.read.entity.Book;
import com.qt.read.feign.factory.BookClientFallbackFactory;
import com.qt.read.query.BookPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 书籍主表表 Feign Client
 *
 * @author mal
 * @since 2020-12-02
 */
@FeignClient(name = "read", path = "/book", fallbackFactory = BookClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface BookClient {

    /**
     * 添加书籍主表表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addBook(@RequestBody Book book) throws Exception;

    /**
     * 修改书籍主表表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateBook(@RequestBody Book book) throws Exception;

    /**
     * 删除书籍主表表
     */
    ApiResult<Boolean> deleteBook(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取书籍主表表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<Book> getBook(@PathVariable("id") Long id) throws Exception;

    /**
     * 书籍主表表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<Book>> getBookPageList(@RequestBody BookPageQuery bookPageQuery) throws Exception;

}
