package com.qt.read.feign;

import com.qt.read.entity.BookCollect;
import com.qt.read.feign.factory.BookCollectClientFallbackFactory;
import com.qt.read.query.BookCollectPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 书籍收藏表 Feign Client
 *
 * @author mal
 * @since 2020-12-02
 */
@FeignClient(name = "read", path = "/bookCollect", fallbackFactory = BookCollectClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface BookCollectClient {

    /**
     * 添加书籍收藏表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addBookCollect(@RequestBody BookCollect bookCollect) throws Exception;

    /**
     * 修改书籍收藏表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateBookCollect(@RequestBody BookCollect bookCollect) throws Exception;

    /**
     * 删除书籍收藏表
     */
    ApiResult<Boolean> deleteBookCollect(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取书籍收藏表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<BookCollect> getBookCollect(@PathVariable("id") Long id) throws Exception;

    /**
     * 书籍收藏表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<BookCollect>> getBookCollectPageList(@RequestBody BookCollectPageQuery bookCollectPageQuery) throws Exception;

}
