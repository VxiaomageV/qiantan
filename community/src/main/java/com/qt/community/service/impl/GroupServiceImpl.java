package com.qt.community.service.impl;

import com.qt.community.entity.Group;
import com.qt.community.mapper.GroupMapper;
import com.qt.community.service.GroupService;
import com.qt.community.query.GroupPageQuery;
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
public class GroupServiceImpl extends BaseServiceImpl<GroupMapper, Group> implements GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveGroup(Group group) throws Exception {
        return super.save(group);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateGroup(Group group) throws Exception {
        return super.updateById(group);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteGroup(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Group> getGroupPageList(GroupPageQuery groupPageQuery) throws Exception {
        Page<Group> page = new PageInfo<>(groupPageQuery, OrderItem.desc(getLambdaColumn(Group::getCreateTime)));
        LambdaQueryWrapper<Group> wrapper = new LambdaQueryWrapper<>();
        IPage<Group> iPage = groupMapper.selectPage(page, wrapper);
        return new Paging<Group>(iPage);
    }

}
