package com.qt.community.controller;

import com.qt.community.entity.DiscussGroup;
import com.qt.community.service.DiscussGroupService;
import lombok.extern.slf4j.Slf4j;
import com.qt.community.query.DiscussGroupPageQuery;
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
@RequestMapping("/discussGroup")
@Api(value = "讨论组主表API", tags = {"讨论组主表"})

public class DiscussGroupController extends BaseController {

    @Autowired
    private DiscussGroupService discussGroupService;

    /**
     * 添加讨论组主表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加讨论组主表", response = ApiResult.class)
    public ApiResult<Boolean> addDiscussGroup(@Validated(Add.class) @RequestBody DiscussGroup discussGroup) throws Exception {
        boolean flag = discussGroupService.saveDiscussGroup(discussGroup);
        return ApiResult.result(flag);
    }

    /**
     * 修改讨论组主表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改讨论组主表", response = ApiResult.class)
    public ApiResult<Boolean> updateDiscussGroup(@Validated(Update.class) @RequestBody DiscussGroup discussGroup) throws Exception {
        boolean flag = discussGroupService.updateDiscussGroup(discussGroup);
        return ApiResult.result(flag);
    }

    /**
     * 删除讨论组主表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除讨论组主表", response = ApiResult.class)
    public ApiResult<Boolean> deleteDiscussGroup(@PathVariable("id") Long id) throws Exception {
        boolean flag = discussGroupService.deleteDiscussGroup(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取讨论组主表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "讨论组主表详情", response = DiscussGroup.class)
    public ApiResult<DiscussGroup> getDiscussGroup(@PathVariable("id") Long id) throws Exception {
        DiscussGroup discussGroup = discussGroupService.getById(id);
        return ApiResult.ok(discussGroup);
    }

    /**
     * 讨论组主表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "讨论组主表分页列表", response = DiscussGroup.class)
    public ApiResult<Paging<DiscussGroup>> getDiscussGroupPageList(@Validated @RequestBody DiscussGroupPageQuery discussGroupPageQuery) throws Exception {
        Paging<DiscussGroup> paging = discussGroupService.getDiscussGroupPageList(discussGroupPageQuery);
        return ApiResult.ok(paging);
    }

}
