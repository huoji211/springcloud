package com.liutf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 *
 *author:liutf
 *date:2021/8/1-9:50
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class,args);
    }
}
