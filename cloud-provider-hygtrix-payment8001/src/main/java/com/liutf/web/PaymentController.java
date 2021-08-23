package com.liutf.web;

import com.liutf.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 *author:liutf
 *date:2021/8/3-21:21
 **/
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PayMentService payMentService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String payMentInfo_OK(@PathVariable("id") Integer id){
        return payMentService.payMentInfo_OK(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String payMentInfo_TimeOut(@PathVariable("id") Integer id){
        return payMentService.payMentInfo_TimeOut(id);
    }
}
