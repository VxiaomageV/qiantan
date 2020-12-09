package com.qt.read.service;

import com.qt.read.entity.BookComment;
import com.qt.read.query.BookCommentPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 书籍评论表 服务类
 *
 * @author mal
 * @since 2020-12-03
 */
public interface BookCommentService extends BaseService<BookComment> {

    /**
     * 保存
     *
     * @param bookComment
     * @return
     * @throws Exception
     */
    boolean saveBookComment(BookComment bookComment) throws Exception;

    /**
     * 修改
     *
     * @param bookComment
     * @return
     * @throws Exception
     */
    boolean updateBookComment(BookComment bookComment) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteBookComment(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param bookCommentQueryParam
     * @return
     * @throws Exception
     */
    Paging<BookComment> getBookCommentPageList(BookCommentPageQuery bookCommentPageQuery) throws Exception;

}
