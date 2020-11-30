package com.qt.community.feign.fallback;

import com.qt.community.entity.DiscussGroup;
import com.qt.community.feign.DiscussGroupClient;
import com.qt.community.query.DiscussGroupPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 讨论组主表 Feign Fallback
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Component
public class DiscussGroupClientFallback implements DiscussGroupClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加讨论组主表
     */
    @Override
    public ApiResult<Boolean> addDiscussGroup(DiscussGroup discussGroup) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改讨论组主表
     */
    @Override
    public ApiResult<Boolean> updateDiscussGroup(DiscussGroup discussGroup) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除讨论组主表
     */
    @Override
    public ApiResult<Boolean> deleteDiscussGroup(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取讨论组主表详情
     */
    @Override
    public ApiResult<DiscussGroup> getDiscussGroup(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 讨论组主表分页列表
     */
    @Override
    public ApiResult<Paging<DiscussGroup>> getDiscussGroupPageList(DiscussGroupPageQuery discussGroupPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
