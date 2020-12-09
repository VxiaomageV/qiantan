package com.qt.read.service;

import com.qt.read.entity.CommentBack;
import com.qt.read.query.CommentBackPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 书籍评论回复表 服务类
 *
 * @author mal
 * @since 2020-12-03
 */
public interface CommentBackService extends BaseService<CommentBack> {

    /**
     * 保存
     *
     * @param commentBack
     * @return
     * @throws Exception
     */
    boolean saveCommentBack(CommentBack commentBack) throws Exception;

    /**
     * 修改
     *
     * @param commentBack
     * @return
     * @throws Exception
     */
    boolean updateCommentBack(CommentBack commentBack) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteCommentBack(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param commentBackQueryParam
     * @return
     * @throws Exception
     */
    Paging<CommentBack> getCommentBackPageList(CommentBackPageQuery commentBackPageQuery) throws Exception;

}
