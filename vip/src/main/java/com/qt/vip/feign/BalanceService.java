package com.qt.vip.feign;

import com.qt.vip.feign.dto.Balance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description: 演示
 * date: 2020/10/21
 * @author wuyanzu
 */
@FeignClient(name = "read", fallback = BalanceServiceFallback.class)
public interface BalanceService {

    /**
     * description: 
     * creat: mal
     * date: 2020/10/21
     */
    @GetMapping(value = "/read/pay/balance")
    Balance getBalance(@RequestParam("id") Integer id);

}
