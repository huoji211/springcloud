package com.liutf.service.impl;

import com.liutf.dao.PayMentMapper;
import com.liutf.entity.PayMent;
import com.liutf.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 *
 *author:liutf
 *date:2021/8/1-2:20
 **/
@Service
public class PayMentServiceImpl implements PayMentService {

    @Autowired
    private PayMentMapper payMentMapper;

    @Override
    public int create(PayMent payMent) {
        return payMentMapper.create(payMent);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return payMentMapper.getPayMentById(id);
    }
}
