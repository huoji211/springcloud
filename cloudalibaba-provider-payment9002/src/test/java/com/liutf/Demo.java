package com.liutf;

import org.junit.Test;

import java.util.UUID;

/***
 *
 *author:liutf
 *date:2021/8/9-23:35
 **/
public class Demo {

    @Test
    public void testUUID(){
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
