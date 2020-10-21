package com.qt.vip.feign;

import com.qt.vip.feign.dto.Balance;
import org.springframework.stereotype.Component;

/**
 * description: 演示
 * date: 2020/10/21
 * @author wuyanzu
 */
@Component
public class BalanceServiceFallback implements BalanceService {

    @Override
    public Balance getBalance(Integer id) {
        return new Balance(0, 0, 0, "降级");
    }
}
