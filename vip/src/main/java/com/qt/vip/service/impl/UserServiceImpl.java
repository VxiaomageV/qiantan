package com.qt.vip.service.impl;

import com.qt.vip.entity.User;
import com.qt.vip.mapper.UserMapper;
import com.qt.vip.service.UserService;
import com.qt.vip.query.UserPageQuery;
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
 * 用户主表 服务实现类
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveUser(User user) throws Exception {
        return super.save(user);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateUser(User user) throws Exception {
        return super.updateById(user);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteUser(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<User> getUserPageList(UserPageQuery userPageQuery) throws Exception {
        Page<User> page = new PageInfo<>(userPageQuery, OrderItem.desc(getLambdaColumn(User::getCreateTime)));
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        IPage<User> iPage = userMapper.selectPage(page, wrapper);
        return new Paging<User>(iPage);
    }

}
