package com.qt.read.service.impl;

import com.qt.read.entity.BookRecord;
import com.qt.read.mapper.BookRecordMapper;
import com.qt.read.service.BookRecordService;
import com.qt.read.query.BookRecordPageQuery;
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
 * 书籍查看记录表 服务实现类
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@Service
public class BookRecordServiceImpl extends BaseServiceImpl<BookRecordMapper, BookRecord> implements BookRecordService {

    @Autowired
    private BookRecordMapper bookRecordMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBookRecord(BookRecord bookRecord) throws Exception {
        return super.save(bookRecord);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBookRecord(BookRecord bookRecord) throws Exception {
        return super.updateById(bookRecord);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteBookRecord(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<BookRecord> getBookRecordPageList(BookRecordPageQuery bookRecordPageQuery) throws Exception {
        Page<BookRecord> page = new PageInfo<>(bookRecordPageQuery, OrderItem.desc(getLambdaColumn(BookRecord::getCreateTime)));
        LambdaQueryWrapper<BookRecord> wrapper = new LambdaQueryWrapper<>();
        // 根据用户ID查询浏览书籍记录
        if (null != bookRecordPageQuery.getUserId() && 0 < bookRecordPageQuery.getUserId()) {
            wrapper.eq(BookRecord::getUserId, bookRecordPageQuery.getUserId());
        }
        IPage<BookRecord> iPage = bookRecordMapper.selectPage(page, wrapper);
        return new Paging<BookRecord>(iPage);
    }

}
