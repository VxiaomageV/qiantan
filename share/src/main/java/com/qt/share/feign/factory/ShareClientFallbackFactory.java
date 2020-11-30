package com.qt.share.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.share.feign.ShareClient;
import com.qt.share.feign.fallback.ShareClientFallback;
import org.springframework.stereotype.Component;

/**
 * 分享主表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-11-30
 */
@Component
public class ShareClientFallbackFactory implements FallbackFactory<ShareClient> {
    @Override
    public ShareClient create(Throwable throwable) {
        ShareClientFallback shareClientFallback = new ShareClientFallback();
        shareClientFallback.setThrowable(throwable);
        return shareClientFallback;
    }
}
