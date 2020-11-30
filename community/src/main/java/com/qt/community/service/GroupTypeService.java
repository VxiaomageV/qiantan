package com.qt.community.service;

import com.qt.community.entity.GroupType;
import com.qt.community.query.GroupTypePageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 讨论组类型表 服务类
 *
 * @author mal
 * @since 2020-11-30
 */
public interface GroupTypeService extends BaseService<GroupType> {

    /**
     * 保存
     *
     * @param groupType
     * @return
     * @throws Exception
     */
    boolean saveGroupType(GroupType groupType) throws Exception;

    /**
     * 修改
     *
     * @param groupType
     * @return
     * @throws Exception
     */
    boolean updateGroupType(GroupType groupType) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteGroupType(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param groupTypeQueryParam
     * @return
     * @throws Exception
     */
    Paging<GroupType> getGroupTypePageList(GroupTypePageQuery groupTypePageQuery) throws Exception;

}
