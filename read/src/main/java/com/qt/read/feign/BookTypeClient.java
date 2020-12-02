package com.qt.read.feign;

import com.qt.read.entity.BookType;
import com.qt.read.feign.factory.BookTypeClientFallbackFactory;
import com.qt.read.query.BookTypePageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 书籍类型表 Feign Client
 *
 * @author mal
 * @since 2020-12-02
 */
@FeignClient(name = "read", path = "/bookType", fallbackFactory = BookTypeClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface BookTypeClient {

    /**
     * 添加书籍类型表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addBookType(@RequestBody BookType bookType) throws Exception;

    /**
     * 修改书籍类型表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateBookType(@RequestBody BookType bookType) throws Exception;

    /**
     * 删除书籍类型表
     */
    ApiResult<Boolean> deleteBookType(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取书籍类型表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<BookType> getBookType(@PathVariable("id") Long id) throws Exception;

    /**
     * 书籍类型表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<BookType>> getBookTypePageList(@RequestBody BookTypePageQuery bookTypePageQuery) throws Exception;

}
