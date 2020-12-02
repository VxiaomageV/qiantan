package com.qt.read.controller;

import com.qt.read.entity.Book;
import com.qt.read.service.BookService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.BookPageQuery;
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
 * 书籍主表表 控制器
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@RestController
@RequestMapping("/book")
@Api(value = "书籍主表表API", tags = {"书籍主表表"})

public class BookController extends BaseController {

    @Autowired
    private BookService bookService;

    /**
     * 添加书籍主表表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍主表表", response = ApiResult.class)
    public ApiResult<Boolean> addBook(@Validated(Add.class) @RequestBody Book book) throws Exception {
        boolean flag = bookService.saveBook(book);
        return ApiResult.result(flag);
    }

    /**
     * 修改书籍主表表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改书籍主表表", response = ApiResult.class)
    public ApiResult<Boolean> updateBook(@Validated(Update.class) @RequestBody Book book) throws Exception {
        boolean flag = bookService.updateBook(book);
        return ApiResult.result(flag);
    }

    /**
     * 删除书籍主表表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍主表表", response = ApiResult.class)
    public ApiResult<Boolean> deleteBook(@PathVariable("id") Long id) throws Exception {
        boolean flag = bookService.deleteBook(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取书籍主表表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "书籍主表表详情", response = Book.class)
    public ApiResult<Book> getBook(@PathVariable("id") Long id) throws Exception {
        Book book = bookService.getById(id);
        return ApiResult.ok(book);
    }

    /**
     * 书籍主表表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "书籍主表表分页列表", response = Book.class)
    public ApiResult<Paging<Book>> getBookPageList(@Validated @RequestBody BookPageQuery bookPageQuery) throws Exception {
        Paging<Book> paging = bookService.getBookPageList(bookPageQuery);
        return ApiResult.ok(paging);
    }

}
