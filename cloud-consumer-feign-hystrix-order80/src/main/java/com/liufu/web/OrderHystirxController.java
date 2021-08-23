package com.liufu.web;

import com.liufu.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 *author:liutf
 *date:2021/8/3-21:43
 **/
@RestController
@Slf4j
public class OrderHystirxController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String payMentInfo_OK(@PathVariable("id") Integer id){
        return  paymentHystrixService.payMentInfo_OK(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "payMentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })
    public String payMentInfo_TimeOut(@PathVariable("id") Integer id){
        return paymentHystrixService.payMentInfo_TimeOut(id);
    }

    public String payMentInfo_TimeOutHandler(Integer id){
        return "服务忙请稍后再重新试试......";
    }
}
