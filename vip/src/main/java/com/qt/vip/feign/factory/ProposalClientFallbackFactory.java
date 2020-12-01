package com.qt.vip.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.vip.feign.ProposalClient;
import com.qt.vip.feign.fallback.ProposalClientFallback;
import org.springframework.stereotype.Component;

/**
 * 意见反馈表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-12-01
 */
@Component
public class ProposalClientFallbackFactory implements FallbackFactory<ProposalClient> {
    @Override
    public ProposalClient create(Throwable throwable) {
        ProposalClientFallback proposalClientFallback = new ProposalClientFallback();
        proposalClientFallback.setThrowable(throwable);
        return proposalClientFallback;
    }
}
