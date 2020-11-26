package com.qt.vip.user.feign;

import com.qt.common.api.ApiResult;
import com.qt.common.config.FeignConfiguration;
import com.qt.common.pagination.Paging;
import com.qt.vip.user.api.feign.factory.UserClientFallbackFactory;
import com.qt.vip.user.entity.User;
import com.qt.vip.user.query.UserPageQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用户主表 Feign Client
 *
 * @author mal
 * @since 2020-11-26
 */
@FeignClient(name = "vip", path = "/user", fallbackFactory = UserClientFallbackFactory.class, configuration = FeignConfiguration.class)
public interface UserClient {

    /**
     * 添加用户主表
     */
    @PostMapping("/add")
    ApiResult<Boolean> addUser(@RequestBody User user) throws Exception;

    /**
     * 修改用户主表
     */
    @PostMapping("/update")
    ApiResult<Boolean> updateUser(@RequestBody User user) throws Exception;

    /**
     * 删除用户主表
     */
    ApiResult<Boolean> deleteUser(@PathVariable("id") Long id) throws Exception;

    /**
     * 获取用户主表详情
     */
    @GetMapping("/info/{id}")
    ApiResult<User> getUser(@PathVariable("id") Long id) throws Exception;

    /**
     * 用户主表分页列表
     */
    @PostMapping("/list")
    ApiResult<Paging<User>> getUserPageList(@RequestBody UserPageQuery userPageQuery) throws Exception;

}
