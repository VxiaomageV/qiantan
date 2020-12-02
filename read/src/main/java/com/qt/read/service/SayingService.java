package com.qt.read.service;

import com.qt.read.entity.Saying;
import com.qt.read.query.SayingPageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 名人名言表 服务类
 *
 * @author mal
 * @since 2020-12-02
 */
public interface SayingService extends BaseService<Saying> {

    /**
     * 保存
     *
     * @param saying
     * @return
     * @throws Exception
     */
    boolean saveSaying(Saying saying) throws Exception;

    /**
     * 修改
     *
     * @param saying
     * @return
     * @throws Exception
     */
    boolean updateSaying(Saying saying) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteSaying(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param sayingQueryParam
     * @return
     * @throws Exception
     */
    Paging<Saying> getSayingPageList(SayingPageQuery sayingPageQuery) throws Exception;

}
