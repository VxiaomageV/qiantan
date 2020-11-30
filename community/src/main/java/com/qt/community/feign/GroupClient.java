package com.qt.community.feign;

import com.qt.community.entity.Group;
import com.qt.community.feign.factory.GroupClientFallbackFactory;
import com.qt.community.query.GroupPageQuery;
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
@FeignClient(name = "community", path = "/group", fallbackFactory = GroupClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface GroupClient {

    /**
     * 添加讨论组主表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addGroup(@RequestBody Group group) throws Exception;

    /**
     * 修改讨论组主表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateGroup(@RequestBody Group group) throws Exception;

    /**
     * 删除讨论组主表
     */
    ApiResult<Boolean> deleteGroup(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取讨论组主表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<Group> getGroup(@PathVariable("id") Long id) throws Exception;

    /**
     * 讨论组主表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<Group>> getGroupPageList(@RequestBody GroupPageQuery groupPageQuery) throws Exception;

}
