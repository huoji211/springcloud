package com.liutf.dao;

import com.liutf.entity.PayMent;
import org.apache.ibatis.annotations.Param;

/***
 *
 *author:liutf
 *date:2021/8/1-2:07
 **/
public interface PayMentMapper {
    public int create(PayMent payMent);

    public PayMent getPayMentById(@Param("id") Long id);
}
