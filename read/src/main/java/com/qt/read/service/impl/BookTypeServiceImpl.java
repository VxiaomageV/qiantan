package com.qt.read.service.impl;

import com.qt.read.entity.BookType;
import com.qt.read.mapper.BookTypeMapper;
import com.qt.read.service.BookTypeService;
import com.qt.read.query.BookTypePageQuery;
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
 * 书籍类型表 服务实现类
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Service
public class BookTypeServiceImpl extends BaseServiceImpl<BookTypeMapper, BookType> implements BookTypeService {

    @Autowired
    private BookTypeMapper bookTypeMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBookType(BookType bookType) throws Exception {
        return super.save(bookType);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBookType(BookType bookType) throws Exception {
        return super.updateById(bookType);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteBookType(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<BookType> getBookTypePageList(BookTypePageQuery bookTypePageQuery) throws Exception {
        Page<BookType> page = new PageInfo<>(bookTypePageQuery, OrderItem.desc(getLambdaColumn(BookType::getCreateTime)));
        LambdaQueryWrapper<BookType> wrapper = new LambdaQueryWrapper<>();
        IPage<BookType> iPage = bookTypeMapper.selectPage(page, wrapper);
        return new Paging<BookType>(iPage);
    }

}
