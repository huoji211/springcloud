package com.liutf.service;

import com.liutf.entity.PayMent;

/***
 *
 *author:liutf
 *date:2021/8/1-2:19
 **/
public interface PayMentService {
    int create(PayMent payMent);
    PayMent getPayMentById(Long id);
}
