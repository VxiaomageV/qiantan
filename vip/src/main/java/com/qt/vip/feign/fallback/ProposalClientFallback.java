package com.qt.vip.feign.fallback;

import com.qt.vip.entity.Proposal;
import com.qt.vip.feign.ProposalClient;
import com.qt.vip.query.ProposalPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 意见反馈表 Feign Fallback
 *
 * @author mal
 * @since 2020-12-01
 */
@Slf4j
@Component
public class ProposalClientFallback implements ProposalClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加意见反馈表
     */
    @Override
    public ApiResult<Boolean> addProposal(Proposal proposal) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改意见反馈表
     */
    @Override
    public ApiResult<Boolean> updateProposal(Proposal proposal) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除意见反馈表
     */
    @Override
    public ApiResult<Boolean> deleteProposal(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取意见反馈表详情
     */
    @Override
    public ApiResult<Proposal> getProposal(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 意见反馈表分页列表
     */
    @Override
    public ApiResult<Paging<Proposal>> getProposalPageList(ProposalPageQuery proposalPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
