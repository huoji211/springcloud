package com.liutf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.activation.MailcapCommandMap;

/***
 *
 *author:liutf
 *date:2021/8/1-12:37
 **/
@SpringBootApplication
@Slf4j
@EnableEurekaServer
public class EurekaMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication.class,args);
        log.info("注册中心服务已启动.......");
    }
}
