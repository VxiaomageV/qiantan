package com.qt.read.controller;

import com.qt.read.entity.CommentBack;
import com.qt.read.service.CommentBackService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.CommentBackPageQuery;
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
 * 书籍评论回复表 控制器
 *
 * @author mal
 * @since 2020-12-03
 */
@Slf4j
@RestController
@RequestMapping("/commentBack")
@Api(value = "书籍评论回复表API", tags = {"书籍评论回复表"})

public class CommentBackController extends BaseController {

    @Autowired
    private CommentBackService commentBackService;

    /**
     * 添加书籍评论回复表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍评论回复表", response = ApiResult.class)
    public ApiResult<Boolean> addCommentBack(@Validated(Add.class) @RequestBody CommentBack commentBack) throws Exception {
        boolean flag = commentBackService.saveCommentBack(commentBack);
        return ApiResult.result(flag);
    }

    /**
     * 修改书籍评论回复表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改书籍评论回复表", response = ApiResult.class)
    public ApiResult<Boolean> updateCommentBack(@Validated(Update.class) @RequestBody CommentBack commentBack) throws Exception {
        boolean flag = commentBackService.updateCommentBack(commentBack);
        return ApiResult.result(flag);
    }

    /**
     * 删除书籍评论回复表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍评论回复表", response = ApiResult.class)
    public ApiResult<Boolean> deleteCommentBack(@PathVariable("id") Long id) throws Exception {
        boolean flag = commentBackService.deleteCommentBack(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取书籍评论回复表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "书籍评论回复表详情", response = CommentBack.class)
    public ApiResult<CommentBack> getCommentBack(@PathVariable("id") Long id) throws Exception {
        CommentBack commentBack = commentBackService.getById(id);
        return ApiResult.ok(commentBack);
    }

    /**
     * 书籍评论回复表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "书籍评论回复表分页列表", response = CommentBack.class)
    public ApiResult<Paging<CommentBack>> getCommentBackPageList(@Validated @RequestBody CommentBackPageQuery commentBackPageQuery) throws Exception {
        Paging<CommentBack> paging = commentBackService.getCommentBackPageList(commentBackPageQuery);
        return ApiResult.ok(paging);
    }

}
