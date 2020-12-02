package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.SayingClient;
import com.qt.read.feign.fallback.SayingClientFallback;
import org.springframework.stereotype.Component;

/**
 * 名人名言表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-02
 */
@Component
public class SayingClientFallbackFactory implements FallbackFactory<SayingClient> {
    @Override
    public SayingClient create(Throwable throwable) {
        SayingClientFallback sayingClientFallback = new SayingClientFallback();
        sayingClientFallback.setThrowable(throwable);
        return sayingClientFallback;
    }
}
