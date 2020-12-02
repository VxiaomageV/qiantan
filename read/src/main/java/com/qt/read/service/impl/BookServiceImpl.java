package com.qt.read.service.impl;

import com.qt.read.entity.Book;
import com.qt.read.mapper.BookMapper;
import com.qt.read.service.BookService;
import com.qt.read.query.BookPageQuery;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qt.common.service.impl.BaseServiceImpl;
import com.qt.common.pagination.Paging;
import com.qt.common.pagination.PageInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 书籍主表表 服务实现类
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Service
public class BookServiceImpl extends BaseServiceImpl<BookMapper, Book> implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBook(Book book) throws Exception {
        return super.save(book);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBook(Book book) throws Exception {
        return super.updateById(book);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteBook(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Book> getBookPageList(BookPageQuery bookPageQuery) throws Exception {
        Page<Book> page = new PageInfo<>(bookPageQuery, OrderItem.desc(getLambdaColumn(Book::getCreateTime)));
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        // 根据图书类型查询图书分页列表
        if (StringUtils.isNotBlank(bookPageQuery.getBookTypeName())) {
            wrapper.eq(Book::getBookTypeName, bookPageQuery.getBookTypeName());
        }
        IPage<Book> iPage = bookMapper.selectPage(page, wrapper);
        return new Paging<Book>(iPage);
    }

}
