package com.qt.read.service.impl;

import com.qt.read.entity.BookComment;
import com.qt.read.mapper.BookCommentMapper;
import com.qt.read.service.BookCommentService;
import com.qt.read.query.BookCommentPageQuery;
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
 * 书籍评论表 服务实现类
 *
 * @author mal
 * @since 2020-12-03
 */
@Slf4j
@Service
public class BookCommentServiceImpl extends BaseServiceImpl<BookCommentMapper, BookComment> implements BookCommentService {

    @Autowired
    private BookCommentMapper bookCommentMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBookComment(BookComment bookComment) throws Exception {
        return super.save(bookComment);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBookComment(BookComment bookComment) throws Exception {
        return super.updateById(bookComment);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteBookComment(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<BookComment> getBookCommentPageList(BookCommentPageQuery bookCommentPageQuery) throws Exception {
        Page<BookComment> page = new PageInfo<>(bookCommentPageQuery, OrderItem.desc(getLambdaColumn(BookComment::getCreateTime)));
        LambdaQueryWrapper<BookComment> wrapper = new LambdaQueryWrapper<>();
        // 根据书籍id查询一级评论列表
        if (null != bookCommentPageQuery.getBookId() && 0 < bookCommentPageQuery.getBookId()) {
            wrapper.eq(BookComment::getBookId, bookCommentPageQuery.getBookId());
        }
        IPage<BookComment> iPage = bookCommentMapper.selectPage(page, wrapper);
        return new Paging<BookComment>(iPage);
    }

}
