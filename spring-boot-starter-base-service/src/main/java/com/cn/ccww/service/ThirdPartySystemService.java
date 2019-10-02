package com.cn.ccww.service;/**
 * Created by Adminn on 2019/10/2.
 */

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

/**
 * @Auther: ccww
 * @Date: 2019/10/2 10:32
 * @Description: 
 */

//模拟第三方系统service
public class ThirdPartySystemService {
    public String getPassword(String objectKey){
        //返回一个32位随机数
        return UUID.randomUUID().toString();
    }
}
