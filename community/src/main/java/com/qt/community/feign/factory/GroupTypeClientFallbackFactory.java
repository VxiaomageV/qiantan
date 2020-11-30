package com.qt.community.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.community.feign.GroupTypeClient;
import com.qt.community.feign.fallback.GroupTypeClientFallback;
import org.springframework.stereotype.Component;

/**
 * 讨论组类型表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-11-30
 */
@Component
public class GroupTypeClientFallbackFactory implements FallbackFactory<GroupTypeClient> {
    @Override
    public GroupTypeClient create(Throwable throwable) {
        GroupTypeClientFallback groupTypeClientFallback = new GroupTypeClientFallback();
        groupTypeClientFallback.setThrowable(throwable);
        return groupTypeClientFallback;
    }
}
