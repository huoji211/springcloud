package com.liutf.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 *
 *author:liutf
 *date:2021/8/9-1:33
 **/
@RestController
@Slf4j
@RequestMapping("/api/payment")
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @GetMapping("/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id){
      return restTemplate.getForObject(serviceUrl+"/api/payment/nacos/"+id,String.class);
    }
}
