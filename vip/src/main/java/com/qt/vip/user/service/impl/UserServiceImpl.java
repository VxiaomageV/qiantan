package com.qt.vip.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qt.common.service.impl.BaseServiceImpl;
import com.qt.core.pagination.PageInfo;
import com.qt.core.pagination.Paging;
import com.qt.vip.user.entity.User;
import com.qt.vip.user.mapper.UserMapper;
import com.qt.vip.user.param.UserPageParam;
import com.qt.vip.user.service.UserService;
import com.qt.vip.user.vo.UserQueryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * 用户主表 服务实现类
 *
 * @author mal
 * @since 2020-11-21
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
    public UserQueryVo getUserById(Serializable id) throws Exception {
    return userMapper.getUserById(id);
    }

    @Override
    public Paging<UserQueryVo> getUserPageList(UserPageParam userPageParam) throws Exception {
        Page<UserQueryVo> page = new PageInfo<>(userPageParam, OrderItem.desc(getLambdaColumn(User::getCreateTime)));
        IPage<UserQueryVo> iPage = userMapper.getUserPageList(page, userPageParam);
        return new Paging<UserQueryVo>(iPage);
    }

}
