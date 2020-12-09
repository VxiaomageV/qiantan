package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.BookCommentClient;
import com.qt.read.feign.fallback.BookCommentClientFallback;
import org.springframework.stereotype.Component;

/**
 * 书籍评论表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-03
 */
@Component
public class BookCommentClientFallbackFactory implements FallbackFactory<BookCommentClient> {
    @Override
    public BookCommentClient create(Throwable throwable) {
        BookCommentClientFallback bookCommentClientFallback = new BookCommentClientFallback();
        bookCommentClientFallback.setThrowable(throwable);
        return bookCommentClientFallback;
    }
}
