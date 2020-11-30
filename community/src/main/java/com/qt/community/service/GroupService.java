package com.qt.community.service;

import com.qt.community.entity.Group;
import com.qt.community.query.GroupPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 讨论组主表 服务类
 *
 * @author mal
 * @since 2020-11-30
 */
public interface GroupService extends BaseService<Group> {

    /**
     * 保存
     *
     * @param group
     * @return
     * @throws Exception
     */
    boolean saveGroup(Group group) throws Exception;

    /**
     * 修改
     *
     * @param group
     * @return
     * @throws Exception
     */
    boolean updateGroup(Group group) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteGroup(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param groupQueryParam
     * @return
     * @throws Exception
     */
    Paging<Group> getGroupPageList(GroupPageQuery groupPageQuery) throws Exception;

}
