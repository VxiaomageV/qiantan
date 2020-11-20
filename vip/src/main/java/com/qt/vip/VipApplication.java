package com.qt.vip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * description:
 * date: 2020/10/21
 * @author wuyanzu
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class VipApplication {

    public static void main(String[] args) {
        SpringApplication.run(VipApplication.class, args);
    }

}
