package com.qt.read.service;

import com.qt.read.entity.BookCollect;
import com.qt.read.query.BookCollectPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 书籍收藏表 服务类
 *
 * @author mal
 * @since 2020-12-02
 */
public interface BookCollectService extends BaseService<BookCollect> {

    /**
     * 保存
     *
     * @param bookCollect
     * @return
     * @throws Exception
     */
    boolean saveBookCollect(BookCollect bookCollect) throws Exception;

    /**
     * 修改
     *
     * @param bookCollect
     * @return
     * @throws Exception
     */
    boolean updateBookCollect(BookCollect bookCollect) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteBookCollect(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param bookCollectQueryParam
     * @return
     * @throws Exception
     */
    Paging<BookCollect> getBookCollectPageList(BookCollectPageQuery bookCollectPageQuery) throws Exception;

}
