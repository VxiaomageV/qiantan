package com.qt.read.feign;

import com.qt.read.entity.CommentBack;
import com.qt.read.feign.factory.CommentBackClientFallbackFactory;
import com.qt.read.query.CommentBackPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 书籍评论回复表 Feign Client
 *
 * @author mal
 * @since 2020-12-03
 */
@FeignClient(name = "read", path = "/commentBack", fallbackFactory = CommentBackClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface CommentBackClient {

    /**
     * 添加书籍评论回复表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addCommentBack(@RequestBody CommentBack commentBack) throws Exception;

    /**
     * 修改书籍评论回复表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateCommentBack(@RequestBody CommentBack commentBack) throws Exception;

    /**
     * 删除书籍评论回复表
     */
    ApiResult<Boolean> deleteCommentBack(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取书籍评论回复表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<CommentBack> getCommentBack(@PathVariable("id") Long id) throws Exception;

    /**
     * 书籍评论回复表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<CommentBack>> getCommentBackPageList(@RequestBody CommentBackPageQuery commentBackPageQuery) throws Exception;

}
