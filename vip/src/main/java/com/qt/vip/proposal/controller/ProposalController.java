package com.qt.vip.proposal.controller;

import com.qt.vip.proposal.entity.Proposal;
import com.qt.vip.proposal.service.ProposalService;
import lombok.extern.slf4j.Slf4j;
import com.qt.vip.proposal.query.ProposalPageQuery;
import com.qt.common.controller.BaseController;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.validator.groups.Add;
import com.qt.common.validator.groups.Update;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 意见反馈表 控制器
 *
 * @author mal
 * @since 2020-11-28
 */
@Slf4j
@RestController
@RequestMapping("/proposal")
@Api(value = "意见反馈表API", tags = {"意见反馈表"})

public class ProposalController extends BaseController {

    @Autowired
    private ProposalService proposalService;

    /**
     * 添加意见反馈表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加意见反馈表", response = ApiResult.class)
    public ApiResult<Boolean> addProposal(@Validated(Add.class) @RequestBody Proposal proposal) throws Exception {
        boolean flag = proposalService.saveProposal(proposal);
        return ApiResult.result(flag);
    }

    /**
     * 修改意见反馈表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改意见反馈表", response = ApiResult.class)
    public ApiResult<Boolean> updateProposal(@Validated(Update.class) @RequestBody Proposal proposal) throws Exception {
        boolean flag = proposalService.updateProposal(proposal);
        return ApiResult.result(flag);
    }

    /**
     * 删除意见反馈表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除意见反馈表", response = ApiResult.class)
    public ApiResult<Boolean> deleteProposal(@PathVariable("id") Long id) throws Exception {
        boolean flag = proposalService.deleteProposal(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取意见反馈表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "意见反馈表详情", response = Proposal.class)
    public ApiResult<Proposal> getProposal(@PathVariable("id") Long id) throws Exception {
        Proposal proposal = proposalService.getById(id);
        return ApiResult.ok(proposal);
    }

    /**
     * 意见反馈表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "意见反馈表分页列表", response = Proposal.class)
    public ApiResult<Paging<Proposal>> getProposalPageList(@Validated @RequestBody ProposalPageQuery proposalPageQuery) throws Exception {
        Paging<Proposal> paging = proposalService.getProposalPageList(proposalPageQuery);
        return ApiResult.ok(paging);
    }

}
