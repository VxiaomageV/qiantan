package com.qt.read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 * date: 2020/10/21
 * @author wuyanzu
 * EnableDiscoveryClient 自动注册
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadApplication.class, args);
    }

}
