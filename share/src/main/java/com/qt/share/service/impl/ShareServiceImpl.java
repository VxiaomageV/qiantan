package com.qt.share.service.impl;

import com.qt.share.entity.Share;
import com.qt.share.mapper.ShareMapper;
import com.qt.share.service.ShareService;
import com.qt.share.query.SharePageQuery;
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
 * 分享主表 服务实现类
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Service
public class ShareServiceImpl extends BaseServiceImpl<ShareMapper, Share> implements ShareService {

    @Autowired
    private ShareMapper shareMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveShare(Share share) throws Exception {
        return super.save(share);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateShare(Share share) throws Exception {
        return super.updateById(share);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteShare(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Share> getSharePageList(SharePageQuery sharePageQuery) throws Exception {
        Page<Share> page = new PageInfo<>(sharePageQuery, OrderItem.desc(getLambdaColumn(Share::getCreateTime)));
        LambdaQueryWrapper<Share> wrapper = new LambdaQueryWrapper<>();
        IPage<Share> iPage = shareMapper.selectPage(page, wrapper);
        return new Paging<Share>(iPage);
    }

}
