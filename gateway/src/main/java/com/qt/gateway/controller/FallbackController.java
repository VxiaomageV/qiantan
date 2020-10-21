package com.qt.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 熔断
 * @author: mal
 * @date: 2020/10/21
 */
@RestController
public class FallbackController {

    @RequestMapping("/defaultFallback")
    public Map defaultFallback() {
        Map map = new HashMap<>(2);
        map.put("code", 1);
        map.put("message", "网络繁忙");
        return map;
    }

}
