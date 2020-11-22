package com.qt.vip.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qt.vip.user.entity.User;
import com.qt.vip.user.param.UserPageParam;
import com.qt.vip.user.vo.UserQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 用户主表 Mapper 接口
 *
 * @author mal
 * @since 2020-11-21
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    UserQueryVo getUserById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param
     * @return
     */
    IPage<UserQueryVo> getUserPageList(@Param("page") Page page, @Param("param") UserPageParam userPageParam);

}
