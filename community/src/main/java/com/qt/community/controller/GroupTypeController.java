package com.qt.community.controller;

import com.qt.community.entity.GroupType;
import com.qt.community.service.GroupTypeService;
import lombok.extern.slf4j.Slf4j;
import com.qt.community.query.GroupTypePageQuery;
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
 * 讨论组类型表 控制器
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@RestController
@RequestMapping("/groupType")
@Api(value = "讨论组类型表API", tags = {"讨论组类型表"})

public class GroupTypeController extends BaseController {

    @Autowired
    private GroupTypeService groupTypeService;

    /**
     * 添加讨论组类型表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加讨论组类型表", response = ApiResult.class)
    public ApiResult<Boolean> addGroupType(@Validated(Add.class) @RequestBody GroupType groupType) throws Exception {
        boolean flag = groupTypeService.saveGroupType(groupType);
        return ApiResult.result(flag);
    }

    /**
     * 修改讨论组类型表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改讨论组类型表", response = ApiResult.class)
    public ApiResult<Boolean> updateGroupType(@Validated(Update.class) @RequestBody GroupType groupType) throws Exception {
        boolean flag = groupTypeService.updateGroupType(groupType);
        return ApiResult.result(flag);
    }

    /**
     * 删除讨论组类型表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除讨论组类型表", response = ApiResult.class)
    public ApiResult<Boolean> deleteGroupType(@PathVariable("id") Long id) throws Exception {
        boolean flag = groupTypeService.deleteGroupType(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取讨论组类型表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "讨论组类型表详情", response = GroupType.class)
    public ApiResult<GroupType> getGroupType(@PathVariable("id") Long id) throws Exception {
        GroupType groupType = groupTypeService.getById(id);
        return ApiResult.ok(groupType);
    }

    /**
     * 讨论组类型表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "讨论组类型表分页列表", response = GroupType.class)
    public ApiResult<Paging<GroupType>> getGroupTypePageList(@Validated @RequestBody GroupTypePageQuery groupTypePageQuery) throws Exception {
        Paging<GroupType> paging = groupTypeService.getGroupTypePageList(groupTypePageQuery);
        return ApiResult.ok(paging);
    }

}
