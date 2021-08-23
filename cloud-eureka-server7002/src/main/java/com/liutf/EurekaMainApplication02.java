package com.liutf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 *
 *author:liutf
 *date:2021/8/1-14:56
 **/
@SpringBootApplication
@Slf4j
@EnableEurekaServer
public class EurekaMainApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication02.class,args);
    }
}
