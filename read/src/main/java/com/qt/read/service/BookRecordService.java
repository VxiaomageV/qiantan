package com.qt.read.service;

import com.qt.read.entity.BookRecord;
import com.qt.read.query.BookRecordPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 书籍查看记录表 服务类
 *
 * @author mal
 * @since 2020-12-02
 */
public interface BookRecordService extends BaseService<BookRecord> {

    /**
     * 保存
     *
     * @param bookRecord
     * @return
     * @throws Exception
     */
    boolean saveBookRecord(BookRecord bookRecord) throws Exception;

    /**
     * 修改
     *
     * @param bookRecord
     * @return
     * @throws Exception
     */
    boolean updateBookRecord(BookRecord bookRecord) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteBookRecord(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param bookRecordQueryParam
     * @return
     * @throws Exception
     */
    Paging<BookRecord> getBookRecordPageList(BookRecordPageQuery bookRecordPageQuery) throws Exception;

}
