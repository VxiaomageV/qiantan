package com.qt.read.controller;

import com.qt.read.entity.BookType;
import com.qt.read.service.BookTypeService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.BookTypePageQuery;
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
 * 书籍类型表 控制器
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@RestController
@RequestMapping("/bookType")
@Api(value = "书籍类型表API", tags = {"书籍类型表"})

public class BookTypeController extends BaseController {

    @Autowired
    private BookTypeService bookTypeService;

    /**
     * 添加书籍类型表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍类型表", response = ApiResult.class)
    public ApiResult<Boolean> addBookType(@Validated(Add.class) @RequestBody BookType bookType) throws Exception {
        boolean flag = bookTypeService.saveBookType(bookType);
        return ApiResult.result(flag);
    }

    /**
     * 修改书籍类型表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改书籍类型表", response = ApiResult.class)
    public ApiResult<Boolean> updateBookType(@Validated(Update.class) @RequestBody BookType bookType) throws Exception {
        boolean flag = bookTypeService.updateBookType(bookType);
        return ApiResult.result(flag);
    }

    /**
     * 删除书籍类型表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍类型表", response = ApiResult.class)
    public ApiResult<Boolean> deleteBookType(@PathVariable("id") Long id) throws Exception {
        boolean flag = bookTypeService.deleteBookType(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取书籍类型表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "书籍类型表详情", response = BookType.class)
    public ApiResult<BookType> getBookType(@PathVariable("id") Long id) throws Exception {
        BookType bookType = bookTypeService.getById(id);
        return ApiResult.ok(bookType);
    }

    /**
     * 书籍类型表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "书籍类型表分页列表", response = BookType.class)
    public ApiResult<Paging<BookType>> getBookTypePageList(@Validated @RequestBody BookTypePageQuery bookTypePageQuery) throws Exception {
        Paging<BookType> paging = bookTypeService.getBookTypePageList(bookTypePageQuery);
        return ApiResult.ok(paging);
    }

}
