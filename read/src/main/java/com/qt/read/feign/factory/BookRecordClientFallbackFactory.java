package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.BookRecordClient;
import com.qt.read.feign.fallback.BookRecordClientFallback;
import org.springframework.stereotype.Component;

/**
 * 书籍查看记录表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-02
 */
@Component
public class BookRecordClientFallbackFactory implements FallbackFactory<BookRecordClient> {
    @Override
    public BookRecordClient create(Throwable throwable) {
        BookRecordClientFallback bookRecordClientFallback = new BookRecordClientFallback();
        bookRecordClientFallback.setThrowable(throwable);
        return bookRecordClientFallback;
    }
}
