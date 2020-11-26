package com.qt.vip.user.controller;

import com.qt.vip.user.entity.User;
import com.qt.vip.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import com.qt.vip.user.api.query.UserPageQuery;
import io.geekidea.cloud.common.core.controller.BaseController;
import io.geekidea.cloud.common.core.api.ApiResult;
import io.geekidea.cloud.common.core.pagination.Paging;
import io.geekidea.cloud.common.core.validator.groups.Add;
import io.geekidea.cloud.common.core.validator.groups.Update;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户主表 控制器
 *
 * @author mal
 * @since 2020-11-26
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "用户主表API", tags = {"用户主表"})

public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户主表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加用户主表", response = ApiResult.class)
    public ApiResult<Boolean> addUser(@Validated(Add.class) @RequestBody User user) throws Exception {
        boolean flag = userService.saveUser(user);
        return ApiResult.result(flag);
    }

    /**
     * 修改用户主表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改用户主表", response = ApiResult.class)
    public ApiResult<Boolean> updateUser(@Validated(Update.class) @RequestBody User user) throws Exception {
        boolean flag = userService.updateUser(user);
        return ApiResult.result(flag);
    }

    /**
     * 删除用户主表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除用户主表", response = ApiResult.class)
    public ApiResult<Boolean> deleteUser(@PathVariable("id") Long id) throws Exception {
        boolean flag = userService.deleteUser(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取用户主表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "用户主表详情", response = User.class)
    public ApiResult<User> getUser(@PathVariable("id") Long id) throws Exception {
        User user = userService.getById(id);
        return ApiResult.ok(user);
    }

    /**
     * 用户主表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "用户主表分页列表", response = User.class)
    public ApiResult<Paging<User>> getUserPageList(@Validated @RequestBody UserPageQuery userPageQuery) throws Exception {
        Paging<User> paging = userService.getUserPageList(userPageQuery);
        return ApiResult.ok(paging);
    }

}
