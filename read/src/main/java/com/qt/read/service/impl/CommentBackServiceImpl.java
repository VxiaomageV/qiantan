package com.qt.read.service.impl;

import com.qt.read.entity.CommentBack;
import com.qt.read.mapper.CommentBackMapper;
import com.qt.read.service.CommentBackService;
import com.qt.read.query.CommentBackPageQuery;
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
 * 书籍评论回复表 服务实现类
 *
 * @author mal
 * @since 2020-12-03
 */
@Slf4j
@Service
public class CommentBackServiceImpl extends BaseServiceImpl<CommentBackMapper, CommentBack> implements CommentBackService {

    @Autowired
    private CommentBackMapper commentBackMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveCommentBack(CommentBack commentBack) throws Exception {
        return super.save(commentBack);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateCommentBack(CommentBack commentBack) throws Exception {
        return super.updateById(commentBack);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteCommentBack(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<CommentBack> getCommentBackPageList(CommentBackPageQuery commentBackPageQuery) throws Exception {
        Page<CommentBack> page = new PageInfo<>(commentBackPageQuery, OrderItem.desc(getLambdaColumn(CommentBack::getCreateTime)));
        LambdaQueryWrapper<CommentBack> wrapper = new LambdaQueryWrapper<>();
        IPage<CommentBack> iPage = commentBackMapper.selectPage(page, wrapper);
        return new Paging<CommentBack>(iPage);
    }

}
