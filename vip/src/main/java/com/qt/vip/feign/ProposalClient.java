package com.qt.vip.feign;

import com.qt.vip.entity.Proposal;
import com.qt.vip.feign.factory.ProposalClientFallbackFactory;
import com.qt.vip.query.ProposalPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 意见反馈表 Feign Client
 *
 * @author mal
 * @since 2020-12-01
 */
@FeignClient(name = "vip", path = "/proposal", fallbackFactory = ProposalClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface ProposalClient {

    /**
     * 添加意见反馈表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addProposal(@RequestBody Proposal proposal) throws Exception;

    /**
     * 修改意见反馈表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateProposal(@RequestBody Proposal proposal) throws Exception;

    /**
     * 删除意见反馈表
     */
    ApiResult<Boolean> deleteProposal(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取意见反馈表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<Proposal> getProposal(@PathVariable("id") Long id) throws Exception;

    /**
     * 意见反馈表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<Proposal>> getProposalPageList(@RequestBody ProposalPageQuery proposalPageQuery) throws Exception;

}
