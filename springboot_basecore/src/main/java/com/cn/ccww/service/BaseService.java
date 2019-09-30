package com.cn.ccww.service;

/**
 * Created by ccww on 2019/9/30.
 */

public class BaseService {

    private String baseServiceName;
    private String baseServiceHost;

    public String addBaseServiceInfo(String baseServiceName,String baseServiceHost){
        this.baseServiceName=baseServiceName;
        this.baseServiceHost=baseServiceHost;
        System.out.println("baseServiceName:"+baseServiceName+"---"+"baseServiceHost:"+baseServiceHost);
        return "baseServiceName:"+baseServiceName+"---"+"baseServiceHost:"+baseServiceHost;
    }
}
