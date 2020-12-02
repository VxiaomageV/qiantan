package com.qt.read.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.read.feign.BookCollectClient;
import com.qt.read.feign.fallback.BookCollectClientFallback;
import org.springframework.stereotype.Component;

/**
 * 书籍收藏表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-02
 */
@Component
public class BookCollectClientFallbackFactory implements FallbackFactory<BookCollectClient> {
    @Override
    public BookCollectClient create(Throwable throwable) {
        BookCollectClientFallback bookCollectClientFallback = new BookCollectClientFallback();
        bookCollectClientFallback.setThrowable(throwable);
        return bookCollectClientFallback;
    }
}
