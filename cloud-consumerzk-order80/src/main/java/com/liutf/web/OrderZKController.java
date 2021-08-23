package com.liutf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 *
 *author:liutf
 *date:2021/8/1-21:18
 **/
@RestController
public class OrderZKController {

    private static final String INVOKE_URL="http://cloud-zkprovider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
