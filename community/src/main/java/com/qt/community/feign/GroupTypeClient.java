package com.qt.community.feign;

import com.qt.community.entity.GroupType;
import com.qt.community.feign.factory.GroupTypeClientFallbackFactory;
import com.qt.community.query.GroupTypePageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 讨论组类型表 Feign Client
 *
 * @author mal
 * @since 2020-11-30
 */
@FeignClient(name = "community", path = "/groupType", fallbackFactory = GroupTypeClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface GroupTypeClient {

    /**
     * 添加讨论组类型表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addGroupType(@RequestBody GroupType groupType) throws Exception;

    /**
     * 修改讨论组类型表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateGroupType(@RequestBody GroupType groupType) throws Exception;

    /**
     * 删除讨论组类型表
     */
    ApiResult<Boolean> deleteGroupType(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取讨论组类型表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<GroupType> getGroupType(@PathVariable("id") Long id) throws Exception;

    /**
     * 讨论组类型表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<GroupType>> getGroupTypePageList(@RequestBody GroupTypePageQuery groupTypePageQuery) throws Exception;

}
