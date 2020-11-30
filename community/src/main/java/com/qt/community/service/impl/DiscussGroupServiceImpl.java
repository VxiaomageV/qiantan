package com.qt.community.service.impl;

import com.qt.community.entity.DiscussGroup;
import com.qt.community.mapper.DiscussGroupMapper;
import com.qt.community.service.DiscussGroupService;
import com.qt.community.query.DiscussGroupPageQuery;
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
 * 讨论组主表 服务实现类
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Service
public class DiscussGroupServiceImpl extends BaseServiceImpl<DiscussGroupMapper, DiscussGroup> implements DiscussGroupService {

    @Autowired
    private DiscussGroupMapper discussGroupMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveDiscussGroup(DiscussGroup discussGroup) throws Exception {
        return super.save(discussGroup);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateDiscussGroup(DiscussGroup discussGroup) throws Exception {
        return super.updateById(discussGroup);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteDiscussGroup(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<DiscussGroup> getDiscussGroupPageList(DiscussGroupPageQuery discussGroupPageQuery) throws Exception {
        Page<DiscussGroup> page = new PageInfo<>(discussGroupPageQuery, OrderItem.desc(getLambdaColumn(DiscussGroup::getCreateTime)));
        LambdaQueryWrapper<DiscussGroup> wrapper = new LambdaQueryWrapper<>();
        IPage<DiscussGroup> iPage = discussGroupMapper.selectPage(page, wrapper);
        return new Paging<DiscussGroup>(iPage);
    }

}
