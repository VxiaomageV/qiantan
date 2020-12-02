package com.qt.read.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.read.entity.Saying;
import com.qt.read.query.SayingPageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 名人名言表 Mapper 接口
 *
 * @author mal
 * @since 2020-12-02
 */
@Repository
public interface SayingMapper extends BaseMapper<Saying> {


}
