package com.qt.share.feign.fallback;

import com.qt.share.entity.Share;
import com.qt.share.feign.ShareClient;
import com.qt.share.query.SharePageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 分享主表 Feign Fallback
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Component
public class ShareClientFallback implements ShareClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加分享主表
     */
    @Override
    public ApiResult<Boolean> addShare(Share share) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改分享主表
     */
    @Override
    public ApiResult<Boolean> updateShare(Share share) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除分享主表
     */
    @Override
    public ApiResult<Boolean> deleteShare(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取分享主表详情
     */
    @Override
    public ApiResult<Share> getShare(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 分享主表分页列表
     */
    @Override
    public ApiResult<Paging<Share>> getSharePageList(SharePageQuery sharePageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
