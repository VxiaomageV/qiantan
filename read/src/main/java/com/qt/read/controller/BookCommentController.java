package com.qt.read.controller;

import com.qt.read.entity.BookComment;
import com.qt.read.service.BookCommentService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.BookCommentPageQuery;
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
 * 书籍评论表 控制器
 *
 * @author mal
 * @since 2020-12-03
 */
@Slf4j
@RestController
@RequestMapping("/bookComment")
@Api(value = "书籍评论表API", tags = {"书籍评论表"})

public class BookCommentController extends BaseController {

    @Autowired
    private BookCommentService bookCommentService;

    /**
     * 添加书籍评论表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍评论表", response = ApiResult.class)
    public ApiResult<Boolean> addBookComment(@Validated(Add.class) @RequestBody BookComment bookComment) throws Exception {
        boolean flag = bookCommentService.saveBookComment(bookComment);
        return ApiResult.result(flag);
    }

    /**
     * 修改书籍评论表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改书籍评论表", response = ApiResult.class)
    public ApiResult<Boolean> updateBookComment(@Validated(Update.class) @RequestBody BookComment bookComment) throws Exception {
        boolean flag = bookCommentService.updateBookComment(bookComment);
        return ApiResult.result(flag);
    }

    /**
     * 删除书籍评论表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍评论表", response = ApiResult.class)
    public ApiResult<Boolean> deleteBookComment(@PathVariable("id") Long id) throws Exception {
        boolean flag = bookCommentService.deleteBookComment(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取书籍评论表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "书籍评论表详情", response = BookComment.class)
    public ApiResult<BookComment> getBookComment(@PathVariable("id") Long id) throws Exception {
        BookComment bookComment = bookCommentService.getById(id);
        return ApiResult.ok(bookComment);
    }

    /**
     * 书籍评论表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "书籍评论表分页列表", response = BookComment.class)
    public ApiResult<Paging<BookComment>> getBookCommentPageList(@Validated @RequestBody BookCommentPageQuery bookCommentPageQuery) throws Exception {
        Paging<BookComment> paging = bookCommentService.getBookCommentPageList(bookCommentPageQuery);
        return ApiResult.ok(paging);
    }

}
