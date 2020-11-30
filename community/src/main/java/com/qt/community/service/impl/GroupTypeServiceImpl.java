package com.qt.community.service.impl;

import com.qt.community.entity.GroupType;
import com.qt.community.mapper.GroupTypeMapper;
import com.qt.community.service.GroupTypeService;
import com.qt.community.query.GroupTypePageQuery;
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
 * 讨论组类型表 服务实现类
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Service
public class GroupTypeServiceImpl extends BaseServiceImpl<GroupTypeMapper, GroupType> implements GroupTypeService {

    @Autowired
    private GroupTypeMapper groupTypeMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveGroupType(GroupType groupType) throws Exception {
        return super.save(groupType);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateGroupType(GroupType groupType) throws Exception {
        return super.updateById(groupType);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteGroupType(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<GroupType> getGroupTypePageList(GroupTypePageQuery groupTypePageQuery) throws Exception {
        Page<GroupType> page = new PageInfo<>(groupTypePageQuery, OrderItem.desc(getLambdaColumn(GroupType::getCreateTime)));
        LambdaQueryWrapper<GroupType> wrapper = new LambdaQueryWrapper<>();
        IPage<GroupType> iPage = groupTypeMapper.selectPage(page, wrapper);
        return new Paging<GroupType>(iPage);
    }

}
