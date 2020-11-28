package com.qt.vip.proposal.service;

import com.qt.vip.proposal.entity.Proposal;
import com.qt.vip.proposal.query.ProposalPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 意见反馈表 服务类
 *
 * @author mal
 * @since 2020-11-28
 */
public interface ProposalService extends BaseService<Proposal> {

    /**
     * 保存
     *
     * @param proposal
     * @return
     * @throws Exception
     */
    boolean saveProposal(Proposal proposal) throws Exception;

    /**
     * 修改
     *
     * @param proposal
     * @return
     * @throws Exception
     */
    boolean updateProposal(Proposal proposal) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteProposal(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param
     * @return
     * @throws Exception
     */
    Paging<Proposal> getProposalPageList(ProposalPageQuery proposalPageQuery) throws Exception;

}
