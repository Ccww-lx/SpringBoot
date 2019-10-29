package com.cn.ccww.service;

import com.cn.ccww.config.HttpRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Auther: Ccww
 * @Date: 2019/10/28 16:51
 * @Description:
 */

@Service
public class TestRestTemplateService {

    @Autowired
    HttpRestTemplate httpRestTemplate;
    @Autowired
    private RestTemplate restTemplate;

    public void testRestTemplate() throws Exception{
        System.out.println("##########test start###########");
        String result = httpRestTemplate.post("http://www.baidu.com", "baidu", String.class);
        //restTemplate.po
    }
}
