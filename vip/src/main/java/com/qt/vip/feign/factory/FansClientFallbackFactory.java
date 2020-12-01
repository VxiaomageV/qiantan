package com.qt.vip.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.vip.feign.FansClient;
import com.qt.vip.feign.fallback.FansClientFallback;
import org.springframework.stereotype.Component;

/**
 * 粉丝表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-02
 */
@Component
public class FansClientFallbackFactory implements FallbackFactory<FansClient> {
    @Override
    public FansClient create(Throwable throwable) {
        FansClientFallback fansClientFallback = new FansClientFallback();
        fansClientFallback.setThrowable(throwable);
        return fansClientFallback;
    }
}
