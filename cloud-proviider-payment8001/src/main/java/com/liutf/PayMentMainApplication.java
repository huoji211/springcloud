package com.liutf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 *
 *author:liutf
 *date:2021/8/1-1:22
 **/
@SpringBootApplication
@MapperScan(value = "com.liutf.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMentMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMainApplication.class,args);
    }
}
