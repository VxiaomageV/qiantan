package com.qt.read;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * description:
 * date: 2020/10/21
 * @author wuyanzu
 * EnableDiscoveryClient 自动注册
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan({"com.qt.**.mapper", "com.qt.vip.**.mapper"})
public class ReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadApplication.class, args);
    }

}
