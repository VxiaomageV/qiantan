package com.qt.vip.feign.fallback;

import com.qt.vip.entity.Fans;
import com.qt.vip.feign.FansClient;
import com.qt.vip.query.FansPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 粉丝表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Component
public class FansClientFallback implements FansClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加粉丝表
     */
    @Override
    public ApiResult<Boolean> addFans(Fans fans) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改粉丝表
     */
    @Override
    public ApiResult<Boolean> updateFans(Fans fans) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除粉丝表
     */
    @Override
    public ApiResult<Boolean> deleteFans(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取粉丝表详情
     */
    @Override
    public ApiResult<Fans> getFans(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 粉丝表分页列表
     */
    @Override
    public ApiResult<Paging<Fans>> getFansPageList(FansPageQuery fansPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
