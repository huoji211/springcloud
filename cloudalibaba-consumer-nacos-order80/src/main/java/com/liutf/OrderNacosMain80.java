package com.liutf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 *
 *author:liutf
 *date:2021/8/9-1:32
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain80.class,args);
    }
}
