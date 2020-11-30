package com.qt.read.service;

import com.qt.read.entity.Book;
import com.qt.read.query.BookPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 书籍主表表 服务类
 *
 * @author mal
 * @since 2020-11-30
 */
public interface BookService extends BaseService<Book> {

    /**
     * 保存
     *
     * @param book
     * @return
     * @throws Exception
     */
    boolean saveBook(Book book) throws Exception;

    /**
     * 修改
     *
     * @param book
     * @return
     * @throws Exception
     */
    boolean updateBook(Book book) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteBook(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param bookQueryParam
     * @return
     * @throws Exception
     */
    Paging<Book> getBookPageList(BookPageQuery bookPageQuery) throws Exception;

}
