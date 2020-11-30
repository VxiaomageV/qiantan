package com.qt.vip.feign.fallback;

import com.qt.vip.entity.User;
import com.qt.vip.feign.UserClient;
import com.qt.vip.query.UserPageQuery;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 用户主表 Feign Fallback
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@Component
public class UserClientFallback implements UserClient {

    @Setter
    private Throwable throwable;

    /**
     * 添加用户主表
     */
    @Override
    public ApiResult<Boolean> addUser(User user) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 修改用户主表
     */
    @Override
    public ApiResult<Boolean> updateUser(User user) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 删除用户主表
     */
    @Override
    public ApiResult<Boolean> deleteUser(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 获取用户主表详情
     */
    @Override
    public ApiResult<User> getUser(Long id) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }

    /**
     * 用户主表分页列表
     */
    @Override
    public ApiResult<Paging<User>> getUserPageList(UserPageQuery userPageQuery) throws Exception {
        log.error("错误原因：", throwable);
        return ApiResult.fail();
    }
}
