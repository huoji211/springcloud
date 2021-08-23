package com.liutf.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 *author:liutf
 *date:2021/8/9-1:18
 **/
@RestController
@Slf4j
@RequestMapping("/api/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }
}
