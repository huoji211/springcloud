package com.liutf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 *
 *author:liutf
 *date:2021/8/1-20:01
 **/
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class PaymentZKMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMain8004.class,args);
    }
}
