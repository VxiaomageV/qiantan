package com.qt.share.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.share.entity.Share;
import com.qt.share.query.SharePageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 分享主表 Mapper 接口
 *
 * @author mal
 * @since 2020-11-30
 */
@Repository
public interface ShareMapper extends BaseMapper<Share> {


}
