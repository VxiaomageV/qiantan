package com.qt.vip.controller;

import com.qt.vip.entity.Fans;
import com.qt.vip.service.FansService;
import lombok.extern.slf4j.Slf4j;
import com.qt.vip.query.FansPageQuery;
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
 * 粉丝表 控制器
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@RestController
@RequestMapping("/fans")
@Api(value = "粉丝表API", tags = {"粉丝表"})

public class FansController extends BaseController {

    @Autowired
    private FansService fansService;

    /**
     * 添加粉丝表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加粉丝表", response = ApiResult.class)
    public ApiResult<Boolean> addFans(@Validated(Add.class) @RequestBody Fans fans) throws Exception {
        boolean flag = fansService.saveFans(fans);
        return ApiResult.result(flag);
    }

    /**
     * 修改粉丝表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改粉丝表", response = ApiResult.class)
    public ApiResult<Boolean> updateFans(@Validated(Update.class) @RequestBody Fans fans) throws Exception {
        boolean flag = fansService.updateFans(fans);
        return ApiResult.result(flag);
    }

    /**
     * 删除粉丝表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除粉丝表", response = ApiResult.class)
    public ApiResult<Boolean> deleteFans(@PathVariable("id") Long id) throws Exception {
        boolean flag = fansService.deleteFans(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取粉丝表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "粉丝表详情", response = Fans.class)
    public ApiResult<Fans> getFans(@PathVariable("id") Long id) throws Exception {
        Fans fans = fansService.getById(id);
        return ApiResult.ok(fans);
    }

    /**
     * 粉丝表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "粉丝表分页列表", response = Fans.class)
    public ApiResult<Paging<Fans>> getFansPageList(@Validated @RequestBody FansPageQuery fansPageQuery) throws Exception {
        Paging<Fans> paging = fansService.getFansPageList(fansPageQuery);
        return ApiResult.ok(paging);
    }

}
