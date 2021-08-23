package com.liutf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/***
 *
 *author:liutf
 *date:2021/8/1-9:52
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PayMent implements Serializable {
    private Long id;
    private String serial;
}