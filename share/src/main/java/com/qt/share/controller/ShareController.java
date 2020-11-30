package com.qt.share.controller;

import com.qt.share.entity.Share;
import com.qt.share.service.ShareService;
import lombok.extern.slf4j.Slf4j;
import com.qt.share.query.SharePageQuery;
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
 * 分享主表 控制器
 *
 * @author mal
 * @since 2020-11-30
 */
@Slf4j
@RestController
@RequestMapping("/share")
@Api(value = "分享主表API", tags = {"分享主表"})

public class ShareController extends BaseController {

    @Autowired
    private ShareService shareService;

    /**
     * 添加分享主表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加分享主表", response = ApiResult.class)
    public ApiResult<Boolean> addShare(@Validated(Add.class) @RequestBody Share share) throws Exception {
        boolean flag = shareService.saveShare(share);
        return ApiResult.result(flag);
    }

    /**
     * 修改分享主表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改分享主表", response = ApiResult.class)
    public ApiResult<Boolean> updateShare(@Validated(Update.class) @RequestBody Share share) throws Exception {
        boolean flag = shareService.updateShare(share);
        return ApiResult.result(flag);
    }

    /**
     * 删除分享主表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除分享主表", response = ApiResult.class)
    public ApiResult<Boolean> deleteShare(@PathVariable("id") Long id) throws Exception {
        boolean flag = shareService.deleteShare(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取分享主表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "分享主表详情", response = Share.class)
    public ApiResult<Share> getShare(@PathVariable("id") Long id) throws Exception {
        Share share = shareService.getById(id);
        return ApiResult.ok(share);
    }

    /**
     * 分享主表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "分享主表分页列表", response = Share.class)
    public ApiResult<Paging<Share>> getSharePageList(@Validated @RequestBody SharePageQuery sharePageQuery) throws Exception {
        Paging<Share> paging = shareService.getSharePageList(sharePageQuery);
        return ApiResult.ok(paging);
    }

}
