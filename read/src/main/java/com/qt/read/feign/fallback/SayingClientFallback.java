package com.qt.read.feign.fallback;

import com.qt.read.entity.Saying;
import com.qt.read.feign.SayingClient;
import com.qt.read.query.SayingPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 名人名言表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Component
public class SayingClientFallback implements SayingClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加名人名言表
     */
    @Override
    public ApiResult<Boolean> addSaying(Saying saying) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改名人名言表
     */
    @Override
    public ApiResult<Boolean> updateSaying(Saying saying) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除名人名言表
     */
    @Override
    public ApiResult<Boolean> deleteSaying(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取名人名言表详情
     */
    @Override
    public ApiResult<Saying> getSaying(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 名人名言表分页列表
     */
    @Override
    public ApiResult<Paging<Saying>> getSayingPageList(SayingPageQuery sayingPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
