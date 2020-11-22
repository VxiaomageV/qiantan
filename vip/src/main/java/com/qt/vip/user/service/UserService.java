package com.qt.vip.user.service;

import com.qt.common.service.BaseService;
import com.qt.core.pagination.Paging;
import com.qt.vip.user.entity.User;
import com.qt.vip.user.param.UserPageParam;
import com.qt.vip.user.vo.UserQueryVo;

import java.io.Serializable;

/**
 * 用户主表 服务类
 *
 * @author mal
 * @since 2020-11-21
 */
public interface UserService extends BaseService<User> {

    /**
     * 保存
     *
     * @param user
     * @return
     * @throws Exception
     */
    boolean saveUser(User user) throws Exception;

    /**
     * 修改
     *
     * @param user
     * @return
     * @throws Exception
     */
    boolean updateUser(User user) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteUser(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    UserQueryVo getUserById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param userQueryParam
     * @return
     * @throws Exception
     */
    Paging<UserQueryVo> getUserPageList(UserPageParam userPageParam) throws Exception;

}
