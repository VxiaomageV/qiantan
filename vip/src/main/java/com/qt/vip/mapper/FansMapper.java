package com.qt.vip.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.vip.entity.Fans;
import com.qt.vip.query.FansPageQuery;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 粉丝表 Mapper 接口
 *
 * @author mal
 * @since 2020-12-02
 */
@Repository
public interface FansMapper extends BaseMapper<Fans> {

    /**
     * 获取关注的总人数
     */
    @Select("select count(1) from fans where user_id = #{userId}")
    int getAttentionCount(@Param("userId") int userId);

    /**
     * 获取观众的总人数
     */
    @Select("select count(1) from fans where fans_id = #{fansId}")
    int getaudienceCount(@Param("fansId") int fansId);


}
