package com.liutf.web;

import com.liutf.entity.CommonResult;
import com.liutf.entity.PayMent;
import com.liutf.feign.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 *author:liutf
 *date:2021/8/2-22:47
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<PayMent> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPayMentById(id);
    }

    @GetMapping(value = "/api/payment/getServerPort")
    public String getServerPort(){
        return  paymentFeignService.getServerPort();
    }
}
