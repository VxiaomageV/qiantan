package com.qt.read.service.impl;

import com.qt.read.entity.Saying;
import com.qt.read.mapper.SayingMapper;
import com.qt.read.service.SayingService;
import com.qt.read.query.SayingPageQuery;
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
 * 名人名言表 服务实现类
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Service
public class SayingServiceImpl extends BaseServiceImpl<SayingMapper, Saying> implements SayingService {

    @Autowired
    private SayingMapper sayingMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveSaying(Saying saying) throws Exception {
        return super.save(saying);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateSaying(Saying saying) throws Exception {
        return super.updateById(saying);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteSaying(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Saying> getSayingPageList(SayingPageQuery sayingPageQuery) throws Exception {
        Page<Saying> page = new PageInfo<>(sayingPageQuery, OrderItem.desc(getLambdaColumn(Saying::getCreateTime)));
        LambdaQueryWrapper<Saying> wrapper = new LambdaQueryWrapper<>();
        IPage<Saying> iPage = sayingMapper.selectPage(page, wrapper);
        return new Paging<Saying>(iPage);
    }

}
