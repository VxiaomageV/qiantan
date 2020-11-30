package com.qt.vip.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qt.vip.entity.User;
import com.qt.vip.query.UserPageQuery;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 用户主表 Mapper 接口
 *
 * @author mal
 * @since 2020-11-30
 */
@Repository
public interface UserMapper extends BaseMapper<User> {


}
