package com.qt.vip.user.feign.factory;

import com.qt.vip.user.feign.UserClient;
import com.qt.vip.user.feign.fallback.UserClientFallback;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 用户主表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-11-26
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
