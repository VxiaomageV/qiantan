package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.CommentBackClient;
import com.qt.read.feign.fallback.CommentBackClientFallback;
import org.springframework.stereotype.Component;

/**
 * 书籍评论回复表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-03
 */
@Component
public class CommentBackClientFallbackFactory implements FallbackFactory<CommentBackClient> {
    @Override
    public CommentBackClient create(Throwable throwable) {
        CommentBackClientFallback commentBackClientFallback = new CommentBackClientFallback();
        commentBackClientFallback.setThrowable(throwable);
        return commentBackClientFallback;
    }
}
