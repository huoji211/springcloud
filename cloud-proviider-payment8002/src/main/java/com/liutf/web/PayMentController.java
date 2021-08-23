package com.liutf.web;

import com.liutf.entity.CommonResult;
import com.liutf.entity.PayMent;
import com.liutf.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/***
 *
 *author:liutf
 *date:2021/8/1-2:23
 **/
@RestController
@RequestMapping(value = "/api/payment")
@Slf4j
public class PayMentController {

    @Autowired
    private PayMentService payMentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody PayMent payMent){
        log.info("添加信息{}",payMent);
        int count = payMentService.create(payMent);
        if(count > 0){
           return new CommonResult(200,"添加成功",count) ;
        }else{
            return new CommonResult(404,"添加失败",count);
        }
    }

    @GetMapping(value = "/getPayMent/{id}")
    public CommonResult<PayMent> getPayMentById(@PathVariable("id") Long id){
        log.info("客户端参数:{}",id);
        PayMent payMent = payMentService.getPayMentById(id);
        if(payMent != null){
            return  new CommonResult(200,"查询成功"+serverPort,payMent);
        }else{
            return new CommonResult(404,"查询失败"+serverPort,null);
        }
    }

    @GetMapping("/getServerPort")
    public String getServerPort(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
