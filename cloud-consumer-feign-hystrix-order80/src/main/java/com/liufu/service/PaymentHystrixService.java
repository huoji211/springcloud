package com.liufu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/***
 *
 *author:liutf
 *date:2021/8/3-21:38
 **/
@Component("paymentHystrixService")
@FeignClient(value = "CLOUD-PROVIDER-HYGTRIX-PAYMENT")
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String payMentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String payMentInfo_TimeOut(@PathVariable("id") Integer id);
}
