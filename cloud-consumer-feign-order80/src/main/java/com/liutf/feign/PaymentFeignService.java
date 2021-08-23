package com.liutf.feign;

import com.liutf.entity.CommonResult;
import com.liutf.entity.PayMent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/***
 *
 *author:liutf
 *date:2021/8/2-22:41
 **/
@Component
@FeignClient(value = "payment-service")
public interface PaymentFeignService {

    @GetMapping(value = "/api/payment/getPayMent/{id}")
    public CommonResult<PayMent> getPayMentById(@PathVariable("id") Long id);

    @GetMapping(value = "/api/payment/getServerPort")
    public String getServerPort();
}
