package com.qt.community.controller;

import com.qt.community.entity.Group;
import com.qt.community.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import com.qt.community.query.GroupPageQuery;
import com.qt.common.controller.BaseController;
import com.qt.common.api.ApiResult;
import com.qt.common.pagination.Paging;
import com.qt.common.validator.groups.Add;
import com.qt.common.validator.groups.Update;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 讨论组主表 控制器
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@RestController
@RequestMapping("/group")
@Api(value = "讨论组主表API", tags = {"讨论组主表"})

public class GroupController extends BaseController {

    @Autowired
    private GroupService groupService;

    /**
     * 添加讨论组主表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加讨论组主表", response = ApiResult.class)
    public ApiResult<Boolean> addGroup(@Validated(Add.class) @RequestBody Group group) throws Exception {
        boolean flag = groupService.saveGroup(group);
        return ApiResult.result(flag);
    }

    /**
     * 修改讨论组主表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改讨论组主表", response = ApiResult.class)
    public ApiResult<Boolean> updateGroup(@Validated(Update.class) @RequestBody Group group) throws Exception {
        boolean flag = groupService.updateGroup(group);
        return ApiResult.result(flag);
    }

    /**
     * 删除讨论组主表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除讨论组主表", response = ApiResult.class)
    public ApiResult<Boolean> deleteGroup(@PathVariable("id") Long id) throws Exception {
        boolean flag = groupService.deleteGroup(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取讨论组主表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "讨论组主表详情", response = Group.class)
    public ApiResult<Group> getGroup(@PathVariable("id") Long id) throws Exception {
        Group group = groupService.getById(id);
        return ApiResult.ok(group);
    }

    /**
     * 讨论组主表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "讨论组主表分页列表", response = Group.class)
    public ApiResult<Paging<Group>> getGroupPageList(@Validated @RequestBody GroupPageQuery groupPageQuery) throws Exception {
        Paging<Group> paging = groupService.getGroupPageList(groupPageQuery);
        return ApiResult.ok(paging);
    }

}
