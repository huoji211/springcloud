package com.liutf.service.impl;

import com.liutf.service.PayMentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/***
 *
 *author:liutf
 *date:2021/8/3-21:19
 **/
@Service
public class PayMentServiceImpl implements PayMentService {

    @Override
    public String payMentInfo_OK(Integer id) {
            return "线程池:"+Thread.currentThread().getName()+" payMentInfo_OK,id="+id+"\t 测试OK";
    }

    @HystrixCommand(fallbackMethod = "payMentInfo_TimeOutHandler"/*指定善后方法名*/,
            commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String payMentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+" payMentInfo_OK,id="+id+"\t 休息3s";
     }
    public String payMentInfo_TimeOutHandler(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
    }

}
