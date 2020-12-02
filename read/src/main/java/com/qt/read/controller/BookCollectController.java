package com.qt.read.controller;

import com.qt.read.entity.BookCollect;
import com.qt.read.service.BookCollectService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.BookCollectPageQuery;
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
 * 书籍收藏表 控制器
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@RestController
@RequestMapping("/bookCollect")
@Api(value = "书籍收藏表API", tags = {"书籍收藏表"})

public class BookCollectController extends BaseController {

    @Autowired
    private BookCollectService bookCollectService;

    /**
     * 添加书籍收藏表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍收藏表", response = ApiResult.class)
    public ApiResult<Boolean> addBookCollect(@Validated(Add.class) @RequestBody BookCollect bookCollect) throws Exception {
        boolean flag = bookCollectService.saveBookCollect(bookCollect);
        return ApiResult.result(flag);
    }

    /**
     * 修改书籍收藏表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改书籍收藏表", response = ApiResult.class)
    public ApiResult<Boolean> updateBookCollect(@Validated(Update.class) @RequestBody BookCollect bookCollect) throws Exception {
        boolean flag = bookCollectService.updateBookCollect(bookCollect);
        return ApiResult.result(flag);
    }

    /**
     * 删除书籍收藏表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍收藏表", response = ApiResult.class)
    public ApiResult<Boolean> deleteBookCollect(@PathVariable("id") Long id) throws Exception {
        boolean flag = bookCollectService.deleteBookCollect(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取书籍收藏表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "书籍收藏表详情", response = BookCollect.class)
    public ApiResult<BookCollect> getBookCollect(@PathVariable("id") Long id) throws Exception {
        BookCollect bookCollect = bookCollectService.getById(id);
        return ApiResult.ok(bookCollect);
    }

    /**
     * 书籍收藏表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "书籍收藏表分页列表", response = BookCollect.class)
    public ApiResult<Paging<BookCollect>> getBookCollectPageList(@Validated @RequestBody BookCollectPageQuery bookCollectPageQuery) throws Exception {
        Paging<BookCollect> paging = bookCollectService.getBookCollectPageList(bookCollectPageQuery);
        return ApiResult.ok(paging);
    }

}
