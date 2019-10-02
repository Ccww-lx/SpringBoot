package com.cn.ccww.service;

import com.cn.ccww.configuration.BaseServiceProperties;
import org.springframework.stereotype.Service;

/**
 * @Auther: ccww
 * @Date: 2019/10/1 09:08
 * @Description:
 */
public class BaseStarterService {

    public void addServiceName(BaseServiceProperties baseServiceProperties){
        System.out.println("serviceName:"+baseServiceProperties.getServiceName()+"----"+"serviceVersion"+baseServiceProperties.getServiceVersion());
    }
}
