package com.qt.community.feign.fallback;

import com.qt.community.entity.GroupType;
import com.qt.community.feign.GroupTypeClient;
import com.qt.community.query.GroupTypePageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 讨论组类型表 Feign Fallback
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Component
public class GroupTypeClientFallback implements GroupTypeClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加讨论组类型表
     */
    @Override
    public ApiResult<Boolean> addGroupType(GroupType groupType) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改讨论组类型表
     */
    @Override
    public ApiResult<Boolean> updateGroupType(GroupType groupType) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除讨论组类型表
     */
    @Override
    public ApiResult<Boolean> deleteGroupType(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取讨论组类型表详情
     */
    @Override
    public ApiResult<GroupType> getGroupType(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 讨论组类型表分页列表
     */
    @Override
    public ApiResult<Paging<GroupType>> getGroupTypePageList(GroupTypePageQuery groupTypePageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
