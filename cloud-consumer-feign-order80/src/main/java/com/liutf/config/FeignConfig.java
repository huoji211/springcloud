package com.liutf.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *
 *author:liutf
 *date:2021/8/2-23:54
 **/
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
       return Logger.Level.FULL;
    }
}
