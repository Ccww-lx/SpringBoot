package com.cn.ccww.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ccww on 2019/9/30.
 */

public class BaseService {

    private String baseServiceName;
    private String baseServiceHost;
    //test 自定义Starter
    @Autowired
    private PasswordService passwordService;

    public String addBaseServiceInfo(String baseServiceName,String baseServiceHost){
        this.baseServiceName=baseServiceName;
        this.baseServiceHost=baseServiceHost;
        System.out.println("baseServiceName:"+baseServiceName+"---"+"baseServiceHost:"+baseServiceHost);
        return "baseServiceName:"+baseServiceName+"---"+"baseServiceHost:"+baseServiceHost;
    }
    public String testPassorsStarter(){
        String password = passwordService.getSystemPassword("password", null);
        return password;
    }
}
