package com.qt.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.community.entity.GroupType;
import com.qt.community.query.GroupTypePageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 讨论组类型表 Mapper 接口
 *
 * @author mal
 * @since 2020-11-30
 */
@Repository
public interface GroupTypeMapper extends BaseMapper<GroupType> {


}
