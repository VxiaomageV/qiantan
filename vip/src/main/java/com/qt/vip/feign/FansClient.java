package com.qt.vip.feign;

import com.qt.vip.entity.Fans;
import com.qt.vip.feign.factory.FansClientFallbackFactory;
import com.qt.vip.query.FansPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 粉丝表 Feign Client
 *
 * @author mal
 * @since 2020-12-02
 */
@FeignClient(name = "vip", path = "/fans", fallbackFactory = FansClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface FansClient {

    /**
     * 添加粉丝表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addFans(@RequestBody Fans fans) throws Exception;

    /**
     * 修改粉丝表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateFans(@RequestBody Fans fans) throws Exception;

    /**
     * 删除粉丝表
     */
    ApiResult<Boolean> deleteFans(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取粉丝表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<Fans> getFans(@PathVariable("id") Long id) throws Exception;

    /**
     * 粉丝表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<Fans>> getFansPageList(@RequestBody FansPageQuery fansPageQuery) throws Exception;

}
