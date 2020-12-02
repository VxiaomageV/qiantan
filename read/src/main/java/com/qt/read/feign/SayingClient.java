package com.qt.read.feign;

import com.qt.read.entity.Saying;
import com.qt.read.feign.factory.SayingClientFallbackFactory;
import com.qt.read.query.SayingPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 名人名言表 Feign Client
 *
 * @author mal
 * @since 2020-12-02
 */
@FeignClient(name = "read", path = "/saying", fallbackFactory = SayingClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface SayingClient {

    /**
     * 添加名人名言表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addSaying(@RequestBody Saying saying) throws Exception;

    /**
     * 修改名人名言表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateSaying(@RequestBody Saying saying) throws Exception;

    /**
     * 删除名人名言表
     */
    ApiResult<Boolean> deleteSaying(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取名人名言表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<Saying> getSaying(@PathVariable("id") Long id) throws Exception;

    /**
     * 名人名言表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<Saying>> getSayingPageList(@RequestBody SayingPageQuery sayingPageQuery) throws Exception;

}
