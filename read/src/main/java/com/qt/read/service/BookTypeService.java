package com.qt.read.service;

import com.qt.read.entity.BookType;
import com.qt.read.query.BookTypePageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 书籍类型表 服务类
 *
 * @author mal
 * @since 2020-12-02
 */
public interface BookTypeService extends BaseService<BookType> {

    /**
     * 保存
     *
     * @param bookType
     * @return
     * @throws Exception
     */
    boolean saveBookType(BookType bookType) throws Exception;

    /**
     * 修改
     *
     * @param bookType
     * @return
     * @throws Exception
     */
    boolean updateBookType(BookType bookType) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteBookType(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param bookTypeQueryParam
     * @return
     * @throws Exception
     */
    Paging<BookType> getBookTypePageList(BookTypePageQuery bookTypePageQuery) throws Exception;

}
