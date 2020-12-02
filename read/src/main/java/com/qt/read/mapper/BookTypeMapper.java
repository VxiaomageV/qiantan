package com.qt.read.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.read.entity.BookType;
import com.qt.read.query.BookTypePageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 书籍类型表 Mapper 接口
 *
 * @author mal
 * @since 2020-12-02
 */
@Repository
public interface BookTypeMapper extends BaseMapper<BookType> {


}
