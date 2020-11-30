package com.qt.read.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.read.entity.Book;
import com.qt.read.query.BookPageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 书籍主表表 Mapper 接口
 *
 * @author mal
 * @since 2020-11-30
 */
@Repository
public interface BookMapper extends BaseMapper<Book> {


}
