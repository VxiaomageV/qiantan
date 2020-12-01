package com.qt.vip.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.vip.feign.UserClient;
import com.qt.vip.feign.fallback.UserClientFallback;
import org.springframework.stereotype.Component;

/**
 * 用户主表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-01
 */
@Component
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable throwable) {
        UserClientFallback userClientFallback = new UserClientFallback();
        userClientFallback.setThrowable(throwable);
        return userClientFallback;
    }
}
