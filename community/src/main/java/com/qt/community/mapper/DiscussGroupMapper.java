package com.qt.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.community.entity.DiscussGroup;
import com.qt.community.query.DiscussGroupPageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 讨论组主表 Mapper 接口
 *
 * @author mal
 * @since 2020-11-30
 */
@Repository
public interface DiscussGroupMapper extends BaseMapper<DiscussGroup> {


}