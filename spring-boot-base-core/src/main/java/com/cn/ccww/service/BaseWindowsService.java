package com.cn.ccww.service;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.lang.Nullable;

/**
 * Created by ccww on 2019/9/30.
 */

public class BaseWindowsService {

    private String serviceName;

    public void addServiceName(String serviceName){
        this.serviceName=serviceName;
        System.out.println("serviceName:"+serviceName);
    }

}
