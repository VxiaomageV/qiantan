package com.qt.vip.user.controller;

import com.qt.common.api.ApiResult;
import com.qt.common.controller.BaseController;
//import com.qt.common.log.annotation.Module;
import com.qt.common.log.annotation.Module;
import com.qt.common.log.annotation.OperationLog;
import com.qt.common.log.enums.OperationLogType;
import com.qt.core.pagination.Paging;
import com.qt.core.validator.groups.Add;
import com.qt.core.validator.groups.Update;
import com.qt.vip.user.entity.User;
import com.qt.vip.user.param.UserPageParam;
import com.qt.vip.user.service.UserService;
import com.qt.vip.user.vo.UserQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户主表 控制器
 *
 * @author mal
 * @since 2020-11-21
 */
@Slf4j
@RestController
@RequestMapping("/user")
//@Module("user")
@Api(value = "用户主表API", tags = {"用户主表"})
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户主表
     */
    @PostMapping("/add")
    @OperationLog(name = "添加用户主表", type = OperationLogType.ADD)
    @ApiOperation(value = "添加用户主表", response = ApiResult.class)
    public ApiResult<Boolean> addUser(@Validated(Add.class) @RequestBody User user) throws Exception {
        boolean flag = userService.saveUser(user);
        return ApiResult.result(flag);
    }

    /**
     * 修改用户主表
     */
    @PostMapping("/update")
    @OperationLog(name = "修改用户主表", type = OperationLogType.UPDATE)
    @ApiOperation(value = "修改用户主表", response = ApiResult.class)
    public ApiResult<Boolean> updateUser(@Validated(Update.class) @RequestBody User user) throws Exception {
        boolean flag = userService.updateUser(user);
        return ApiResult.result(flag);
    }

    /**
     * 删除用户主表
     */
    @PostMapping("/delete/{id}")
    @OperationLog(name = "删除用户主表", type = OperationLogType.DELETE)
    @ApiOperation(value = "删除用户主表", response = ApiResult.class)
    public ApiResult<Boolean> deleteUser(@PathVariable("id") Long id) throws Exception {
        boolean flag = userService.deleteUser(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取用户主表详情
     */
    @GetMapping("/info/{id}")
    @OperationLog(name = "用户主表详情", type = OperationLogType.INFO)
    @ApiOperation(value = "用户主表详情", response = UserQueryVo.class)
    public ApiResult<UserQueryVo> getUser(@PathVariable("id") Long id) throws Exception {
        UserQueryVo userQueryVo = userService.getUserById(id);
        return ApiResult.ok(userQueryVo);
    }

    /**
     * 用户主表分页列表
     */
    @PostMapping("/getPageList")
    @OperationLog(name = "用户主表分页列表", type = OperationLogType.PAGE)
    @ApiOperation(value = "用户主表分页列表", response = UserQueryVo.class)
    public ApiResult<Paging<UserQueryVo>> getUserPageList(@Validated @RequestBody UserPageParam userPageParam) throws Exception {
        Paging<UserQueryVo> paging = userService.getUserPageList(userPageParam);
        return ApiResult.ok(paging);
    }

}

