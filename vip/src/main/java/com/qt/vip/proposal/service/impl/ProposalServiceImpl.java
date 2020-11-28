package com.qt.vip.proposal.service.impl;

import com.qt.vip.proposal.entity.Proposal;
import com.qt.vip.proposal.mapper.ProposalMapper;
import com.qt.vip.proposal.service.ProposalService;
import com.qt.vip.proposal.query.ProposalPageQuery;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qt.common.service.impl.BaseServiceImpl;
import com.qt.common.pagination.Paging;
import com.qt.common.pagination.PageInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 意见反馈表 服务实现类
 *
 * @author mal
 * @since 2020-11-28
 */
@Slf4j
@Service
public class ProposalServiceImpl extends BaseServiceImpl<ProposalMapper, Proposal> implements ProposalService {

    @Autowired
    private ProposalMapper proposalMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveProposal(Proposal proposal) throws Exception {
        return super.save(proposal);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateProposal(Proposal proposal) throws Exception {
        return super.updateById(proposal);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteProposal(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Proposal> getProposalPageList(ProposalPageQuery proposalPageQuery) throws Exception {
        Page<Proposal> page = new PageInfo<>(proposalPageQuery, OrderItem.desc(getLambdaColumn(Proposal::getCreateTime)));
        LambdaQueryWrapper<Proposal> wrapper = new LambdaQueryWrapper<>();
        IPage<Proposal> iPage = proposalMapper.selectPage(page, wrapper);
        return new Paging<Proposal>(iPage);
    }

}
