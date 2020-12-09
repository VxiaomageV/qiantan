package com.qt.read.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.read.entity.BookComment;
import com.qt.read.query.BookCommentPageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 书籍评论表 Mapper 接口
 *
 * @author mal
 * @since 2020-12-03
 */
@Repository
public interface BookCommentMapper extends BaseMapper<BookComment> {


}