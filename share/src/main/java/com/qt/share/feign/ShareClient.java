package com.qt.share.feign;

import com.qt.share.entity.Share;
import com.qt.share.feign.factory.ShareClientFallbackFactory;
import com.qt.share.query.SharePageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 分享主表 Feign Client
 *
 * @author mal
 * @since 2020-11-30
 */
@FeignClient(name = "share", path = "/share", fallbackFactory = ShareClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface ShareClient {

    /**
     * 添加分享主表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addShare(@RequestBody Share share) throws Exception;

    /**
     * 修改分享主表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateShare(@RequestBody Share share) throws Exception;

    /**
     * 删除分享主表
     */
    ApiResult<Boolean> deleteShare(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取分享主表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<Share> getShare(@PathVariable("id") Long id) throws Exception;

    /**
     * 分享主表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<Share>> getSharePageList(@RequestBody SharePageQuery sharePageQuery) throws Exception;

}
