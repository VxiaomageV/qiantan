package com.qt.read.feign;

import com.qt.read.entity.BookComment;
import com.qt.read.feign.factory.BookCommentClientFallbackFactory;
import com.qt.read.query.BookCommentPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 书籍评论表 Feign Client
 *
 * @author mal
 * @since 2020-12-03
 */
@FeignClient(name = "read", path = "/bookComment", fallbackFactory = BookCommentClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface BookCommentClient {

    /**
     * 添加书籍评论表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addBookComment(@RequestBody BookComment bookComment) throws Exception;

    /**
     * 修改书籍评论表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateBookComment(@RequestBody BookComment bookComment) throws Exception;

    /**
     * 删除书籍评论表
     */
    ApiResult<Boolean> deleteBookComment(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取书籍评论表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<BookComment> getBookComment(@PathVariable("id") Long id) throws Exception;

    /**
     * 书籍评论表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<BookComment>> getBookCommentPageList(@RequestBody BookCommentPageQuery bookCommentPageQuery) throws Exception;

}
