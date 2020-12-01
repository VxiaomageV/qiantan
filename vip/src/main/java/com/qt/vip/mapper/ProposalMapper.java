package com.qt.vip.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.vip.entity.Proposal;
import com.qt.vip.query.ProposalPageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 意见反馈表 Mapper 接口
 *
 * @author mal
 * @since 2020-12-01
 */
@Repository
public interface ProposalMapper extends BaseMapper<Proposal> {


}
