package com.qt.community.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.community.feign.GroupClient;
import com.qt.community.feign.fallback.GroupClientFallback;
import org.springframework.stereotype.Component;

/**
 * 讨论组主表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-11-30
 */
@Component
public class GroupClientFallbackFactory implements FallbackFactory<GroupClient> {
    @Override
    public GroupClient create(Throwable throwable) {
        GroupClientFallback groupClientFallback = new GroupClientFallback();
        groupClientFallback.setThrowable(throwable);
        return groupClientFallback;
    }
}
