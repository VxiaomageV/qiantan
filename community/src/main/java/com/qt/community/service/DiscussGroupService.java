package com.qt.community.service;

import com.qt.community.entity.DiscussGroup;
import com.qt.community.query.DiscussGroupPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 讨论组主表 服务类
 *
 * @author mal
 * @since 2020-11-30
 */
public interface DiscussGroupService extends BaseService<DiscussGroup> {

    /**
     * 保存
     *
     * @param discussGroup
     * @return
     * @throws Exception
     */
    boolean saveDiscussGroup(DiscussGroup discussGroup) throws Exception;

    /**
     * 修改
     *
     * @param discussGroup
     * @return
     * @throws Exception
     */
    boolean updateDiscussGroup(DiscussGroup discussGroup) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteDiscussGroup(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param discussGroupQueryParam
     * @return
     * @throws Exception
     */
    Paging<DiscussGroup> getDiscussGroupPageList(DiscussGroupPageQuery discussGroupPageQuery) throws Exception;

}
