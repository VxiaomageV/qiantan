package com.qt.vip.controller;


import com.qt.vip.feign.BalanceService;
import com.qt.vip.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * description: 演示
 * date: 2020/10/21
 * @author wuyanzu
 */
@RestController
@Api(tags = {"vip-test"})
public class AccountController {

    final static Map<Integer, User> userMap = new HashMap() {
        {
            put(1, new User(1, "张三"));
            put(2, new User(2, "李四"));
            put(3, new User(3, "王五"));
        }
    };

    @Resource
    BalanceService balanceService;

    @GetMapping("/acc/user")
    @ApiOperation(value = "测试一下", notes = "测试数据")
    public User getUser(@RequestParam Integer id) {
        if (id != null && userMap.containsKey(id)) {
            User user = userMap.get(id);
            user.setBalance(balanceService.getBalance(id));
            return user;
        }
        return new User(0, "");
    }

}
