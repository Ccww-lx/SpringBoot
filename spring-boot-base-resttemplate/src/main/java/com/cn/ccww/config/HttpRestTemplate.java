package com.cn.ccww.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ccww
 * @Date: 2019/10/25 22:57
 * @Description: 
 */
@Component
public class HttpRestTemplate {
    @Autowired
    public RestTemplate restTemplate;

    /**
     * 发送post请求
     *
     * @param url  请求URL地址
     * @param data json数据
     */
    public <T> T post(String url, String data, Class<T> returnClass)
            throws Exception {
        HttpEntity<String> formEntity = new HttpEntity<String>(data);
        return getRestTemplate().postForObject(url, formEntity, returnClass);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
