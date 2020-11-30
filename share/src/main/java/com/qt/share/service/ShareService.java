package com.qt.share.service;

import com.qt.share.entity.Share;
import com.qt.share.query.SharePageQuery;
import com.qt.common.service.BaseService;
import com.qt.common.pagination.Paging;

/**
 * 分享主表 服务类
 *
 * @author mal
 * @since 2020-11-30
 */
public interface ShareService extends BaseService<Share> {

    /**
     * 保存
     *
     * @param share
     * @return
     * @throws Exception
     */
    boolean saveShare(Share share) throws Exception;

    /**
     * 修改
     *
     * @param share
     * @return
     * @throws Exception
     */
    boolean updateShare(Share share) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteShare(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param shareQueryParam
     * @return
     * @throws Exception
     */
    Paging<Share> getSharePageList(SharePageQuery sharePageQuery) throws Exception;

}
