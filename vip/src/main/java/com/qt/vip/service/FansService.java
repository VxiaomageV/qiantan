package com.qt.vip.service;

import com.qt.vip.entity.Fans;
import com.qt.vip.query.FansPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 粉丝表 服务类
 *
 * @author mal
 * @since 2020-12-02
 */
public interface FansService extends BaseService<Fans> {

    /**
     * 保存
     *
     * @param fans
     * @return
     * @throws Exception
     */
    boolean saveFans(Fans fans) throws Exception;

    /**
     * 修改
     *
     * @param fans
     * @return
     * @throws Exception
     */
    boolean updateFans(Fans fans) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteFans(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param fansQueryParam
     * @return
     * @throws Exception
     */
    Paging<Fans> getFansPageList(FansPageQuery fansPageQuery) throws Exception;

    /**
     * 获取关注的总人数
     *
     * @return
     * @throws Exception
     */
    int getAttentionCount(int userId) throws Exception;

    /**
     * 获取观众的总人数
     *
     * @return
     * @throws Exception
     */
    int getAudienceCount(int fansId) throws Exception;

}
