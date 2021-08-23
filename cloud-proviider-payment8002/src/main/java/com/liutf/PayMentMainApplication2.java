package com.liutf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 *
 *author:liutf
 *date:2021/8/1-1:22
 **/
@SpringBootApplication
@MapperScan(value = "com.liutf.dao")
@EnableEurekaClient
public class PayMentMainApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMainApplication2.class,args);
    }
}
