package com.qt.community.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.community.feign.DiscussGroupClient;
import com.qt.community.feign.fallback.DiscussGroupClientFallback;
import org.springframework.stereotype.Component;

/**
 * 讨论组主表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-11-30
 */
@Component
public class DiscussGroupClientFallbackFactory implements FallbackFactory<DiscussGroupClient> {
    @Override
    public DiscussGroupClient create(Throwable throwable) {
        DiscussGroupClientFallback discussGroupClientFallback = new DiscussGroupClientFallback();
        discussGroupClientFallback.setThrowable(throwable);
        return discussGroupClientFallback;
    }
}
