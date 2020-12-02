package com.qt.read.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qt.common.pagination.PageInfo;
import com.qt.common.pagination.Paging;
import com.qt.common.service.impl.BaseServiceImpl;
import com.qt.read.entity.BookCollect;
import com.qt.read.mapper.BookCollectMapper;
import com.qt.read.query.BookCollectPageQuery;
import com.qt.read.service.BookCollectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 书籍收藏表 服务实现类
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Service
public class BookCollectServiceImpl extends BaseServiceImpl<BookCollectMapper, BookCollect> implements BookCollectService {

    @Autowired
    private BookCollectMapper bookCollectMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBookCollect(BookCollect bookCollect) throws Exception {
        return super.save(bookCollect);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBookCollect(BookCollect bookCollect) throws Exception {
        return super.updateById(bookCollect);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteBookCollect(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<BookCollect> getBookCollectPageList(BookCollectPageQuery bookCollectPageQuery) throws Exception {
        Page<BookCollect> page = new PageInfo<>(bookCollectPageQuery, OrderItem.desc(getLambdaColumn(BookCollect::getCreateTime)));
        LambdaQueryWrapper<BookCollect> wrapper = new LambdaQueryWrapper<>();
        if (null != bookCollectPageQuery.getUserId() && 0 < bookCollectPageQuery.getUserId()) {
            wrapper.eq(BookCollect::getUserId, bookCollectPageQuery.getUserId());
        }
        IPage<BookCollect> iPage = bookCollectMapper.selectPage(page, wrapper);
        return new Paging<BookCollect>(iPage);
    }

}
