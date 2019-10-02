package com.cn.ccww.configuration;/**
 * Created by Adminn on 2019/10/1.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: ccww
 * @Date: 2019/10/1 09:19
 * @Description: 
 */
//通过@ConfigurationProperties注解获取属性值
@ConfigurationProperties(prefix = "project.starter")
public class BaseServiceProperties {
    private String serviceName;
    private String serviceVersion;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }
}
