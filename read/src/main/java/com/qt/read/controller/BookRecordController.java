package com.qt.read.controller;

import com.qt.read.entity.BookRecord;
import com.qt.read.service.BookRecordService;
import lombok.extern.slf4j.Slf4j;
import com.qt.read.query.BookRecordPageQuery;
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
 * 书籍查看记录表 控制器
 *
 * @author mal
 * @since 2020-12-02
 */
@Slf4j
@RestController
@RequestMapping("/bookRecord")
@Api(value = "书籍查看记录表API", tags = {"书籍查看记录表"})

public class BookRecordController extends BaseController {

    @Autowired
    private BookRecordService bookRecordService;

    /**
     * 添加书籍查看记录表
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍查看记录表", response = ApiResult.class)
    public ApiResult<Boolean> addBookRecord(@Validated(Add.class) @RequestBody BookRecord bookRecord) throws Exception {
        boolean flag = bookRecordService.saveBookRecord(bookRecord);
        return ApiResult.result(flag);
    }

    /**
     * 修改书籍查看记录表
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改书籍查看记录表", response = ApiResult.class)
    public ApiResult<Boolean> updateBookRecord(@Validated(Update.class) @RequestBody BookRecord bookRecord) throws Exception {
        boolean flag = bookRecordService.updateBookRecord(bookRecord);
        return ApiResult.result(flag);
    }

    /**
     * 删除书籍查看记录表
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍查看记录表", response = ApiResult.class)
    public ApiResult<Boolean> deleteBookRecord(@PathVariable("id") Long id) throws Exception {
        boolean flag = bookRecordService.deleteBookRecord(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取书籍查看记录表详情
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "书籍查看记录表详情", response = BookRecord.class)
    public ApiResult<BookRecord> getBookRecord(@PathVariable("id") Long id) throws Exception {
        BookRecord bookRecord = bookRecordService.getById(id);
        return ApiResult.ok(bookRecord);
    }

    /**
     * 书籍查看记录表分页列表
     */
    @PostMapping("/page")
    @ApiOperation(value = "书籍查看记录表分页列表", response = BookRecord.class)
    public ApiResult<Paging<BookRecord>> getBookRecordPageList(@Validated @RequestBody BookRecordPageQuery bookRecordPageQuery) throws Exception {
        Paging<BookRecord> paging = bookRecordService.getBookRecordPageList(bookRecordPageQuery);
        return ApiResult.ok(paging);
    }

}
