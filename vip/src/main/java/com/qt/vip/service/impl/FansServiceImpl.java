package com.qt.vip.service.impl;

import com.alibaba.csp.sentinel.util.StringUtil;
import com.qt.vip.entity.Fans;
import com.qt.vip.mapper.FansMapper;
import com.qt.vip.service.FansService;
import com.qt.vip.query.FansPageQuery;
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
 * 粉丝表 服务实现类
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Service
public class FansServiceImpl extends BaseServiceImpl<FansMapper, Fans> implements FansService {

    @Autowired
    private FansMapper fansMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveFans(Fans fans) throws Exception {
        return super.save(fans);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateFans(Fans fans) throws Exception {
        return super.updateById(fans);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteFans(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Fans> getFansPageList(FansPageQuery fansPageQuery) throws Exception {
        Page<Fans> page = new PageInfo<>(fansPageQuery, OrderItem.desc(getLambdaColumn(Fans::getCreateTime)));
        LambdaQueryWrapper<Fans> wrapper = new LambdaQueryWrapper<>();
        // 查询关注的用户列表
        if (null != fansPageQuery.getUserId()) {
            wrapper.eq(Fans::getUserId, fansPageQuery.getUserId());
        }
        // 查询观众用户列表
        if (null != fansPageQuery.getFansId()) {
            wrapper.eq(Fans::getFansId, fansPageQuery.getFansId());
        }
        IPage<Fans> iPage = fansMapper.selectPage(page, wrapper);
        return new Paging<Fans>(iPage);
    }

    @Override
    public int getAttentionCount(int userId) throws Exception {
        return fansMapper.getAttentionCount(userId);
    }

    @Override
    public int getAudienceCount(int fansId) throws Exception {
        return fansMapper.getaudienceCount(fansId);
    }

}
