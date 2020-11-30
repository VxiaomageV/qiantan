package com.qt.community.feign;

import com.qt.community.entity.DiscussGroup;
import com.qt.community.feign.factory.DiscussGroupClientFallbackFactory;
import com.qt.community.query.DiscussGroupPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 讨论组主表 Feign Client
 *
 * @author mal
 * @since 2020-11-30
 */
@FeignClient(name = "community", path = "/discussGroup", fallbackFactory = DiscussGroupClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface DiscussGroupClient {

    /**
     * 添加讨论组主表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addDiscussGroup(@RequestBody DiscussGroup discussGroup) throws Exception;

    /**
     * 修改讨论组主表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateDiscussGroup(@RequestBody DiscussGroup discussGroup) throws Exception;

    /**
     * 删除讨论组主表
     */
    ApiResult<Boolean> deleteDiscussGroup(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取讨论组主表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<DiscussGroup> getDiscussGroup(@PathVariable("id") Long id) throws Exception;

    /**
     * 讨论组主表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<DiscussGroup>> getDiscussGroupPageList(@RequestBody DiscussGroupPageQuery discussGroupPageQuery) throws Exception;

}
