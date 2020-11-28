package com.qt.vip.proposal.feign.factory;

import feign.hystrix.FallbackFactory;
import com.qt.vip.proposal.feign.ProposalClient;
import com.qt.vip.proposal.feign.fallback.ProposalClientFallback;
import org.springframework.stereotype.Component;

/**
 * 意见反馈表 Feign Fallback Factory
 *
 * @author mal
 * @since 2020-11-28
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
