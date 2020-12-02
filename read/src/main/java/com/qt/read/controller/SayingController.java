package com.qt.read.controller;

import com.qt.read.entity.Saying;
import com.qt.read.service.SayingService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.SayingPageQuery;
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
 * 名人名言表 控制器
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@RestController
@RequestMapping("/saying")
@Api(value = "名人名言表API", tags = {"名人名言表"})

public class SayingController extends BaseController {

    @Autowired
    private SayingService sayingService;

    /**
     * 添加名人名言表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加名人名言表", response = ApiResult.class)
    public ApiResult<Boolean> addSaying(@Validated(Add.class) @RequestBody Saying saying) throws Exception {
        boolean flag = sayingService.saveSaying(saying);
        return ApiResult.result(flag);
    }

    /**
     * 修改名人名言表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改名人名言表", response = ApiResult.class)
    public ApiResult<Boolean> updateSaying(@Validated(Update.class) @RequestBody Saying saying) throws Exception {
        boolean flag = sayingService.updateSaying(saying);
        return ApiResult.result(flag);
    }

    /**
     * 删除名人名言表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除名人名言表", response = ApiResult.class)
    public ApiResult<Boolean> deleteSaying(@PathVariable("id") Long id) throws Exception {
        boolean flag = sayingService.deleteSaying(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取名人名言表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "名人名言表详情", response = Saying.class)
    public ApiResult<Saying> getSaying(@PathVariable("id") Long id) throws Exception {
        Saying saying = sayingService.getById(id);
        return ApiResult.ok(saying);
    }

    /**
     * 名人名言表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "名人名言表分页列表", response = Saying.class)
    public ApiResult<Paging<Saying>> getSayingPageList(@Validated @RequestBody SayingPageQuery sayingPageQuery) throws Exception {
        Paging<Saying> paging = sayingService.getSayingPageList(sayingPageQuery);
        return ApiResult.ok(paging);
    }

}
