package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.BookClient;
import com.qt.read.feign.fallback.BookClientFallback;
import org.springframework.stereotype.Component;

/**
 * 书籍主表表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-02
 */
@Component
public class BookClientFallbackFactory implements FallbackFactory<BookClient> {
    @Override
    public BookClient create(Throwable throwable) {
        BookClientFallback bookClientFallback = new BookClientFallback();
        bookClientFallback.setThrowable(throwable);
        return bookClientFallback;
    }
}
