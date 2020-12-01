package com.qt.vip.service;

import com.qt.common.api.ApiResult;
import com.qt.vip.entity.User;
import com.qt.vip.query.UserPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;
import com.qt.vip.vo.UserVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 用户主表 服务类
 *
 * @author mal
 * @since 2020-12-01
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
     * 获取分页对象
     *
     * @param userQueryParam
     * @return
     * @throws Exception
     */
    Paging<User> getUserPageList(UserPageQuery userPageQuery) throws Exception;

    /**
     * 获取我的首页整体信息
     */
    UserVo getUserMessage() throws Exception;

}
