package com.liutf.web;

import com.liutf.entity.CommonResult;
import com.liutf.entity.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/***
 *
 *author:liutf
 *date:2021/8/1-9:52
 **/
@RestController
@RequestMapping(value = "/api/order")
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/create")
    public CommonResult create(PayMent payMent){
        log.info("添加信息{}",payMent);
        CommonResult result = restTemplate.postForObject(PAYMENT_URL+"/api/payment/create",payMent,CommonResult.class);
        return result;
    }

    @GetMapping(value = "/getPayMent/{id}")
    public CommonResult<PayMent> getPayMentById(@PathVariable("id") Long id){
        log.info("参数:{}",id);
        return restTemplate.getForObject(PAYMENT_URL+"/api/payment/getPayMent/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<PayMent> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/api/payment/getPayMent/" + id, CommonResult.class);
        if(entity != null && entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return new CommonResult<PayMent>(404,"查询报错",null);
        }
    }

    @GetMapping("/zipkin")
    public String paymentZipkin(){
        return restTemplate.getForObject(PAYMENT_URL+"/api/payment/zipkin",String.class);
    }
}
