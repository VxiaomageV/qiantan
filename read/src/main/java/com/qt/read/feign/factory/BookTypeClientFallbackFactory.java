package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.BookTypeClient;
import com.qt.read.feign.fallback.BookTypeClientFallback;
import org.springframework.stereotype.Component;

/**
 * 书籍类型表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-02
 */
@Component
public class BookTypeClientFallbackFactory implements FallbackFactory<BookTypeClient> {
    @Override
    public BookTypeClient create(Throwable throwable) {
        BookTypeClientFallback bookTypeClientFallback = new BookTypeClientFallback();
        bookTypeClientFallback.setThrowable(throwable);
        return bookTypeClientFallback;
    }
}
