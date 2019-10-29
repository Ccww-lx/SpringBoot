package com.cn.ccww.config;

import com.cn.ccww.component.CustomMappingJackson2HttpMessageConverter;
import com.cn.ccww.component.CustomResponseErrorHandler;
import com.cn.ccww.component.HeadClientHttpRequestInterceptor;
import com.cn.ccww.component.TrackLogClientHttpRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ccww
 * @Date: 2019/10/25 22:43
 * @Description: 
 */
@Configuration
public class RestTemplateConfig {

    @Value("${resttemplate.connection.timeout}")
    private int restTemplateConnectionTimeout;
    @Value("${resttemplate.read.timeout}")
    private int restTemplateReadTimeout;

    @Bean
    //@LoadBalanced
    public RestTemplate restTemplate( ClientHttpRequestFactory simleClientHttpRequestFactory) {
        RestTemplate restTemplate = new RestTemplate();
        //配置自定义的message转换器
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        messageConverters.add(new CustomMappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);
        //配置自定义的interceptor拦截器
        List<ClientHttpRequestInterceptor> interceptors=new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new HeadClientHttpRequestInterceptor());
        interceptors.add(new TrackLogClientHttpRequestInterceptor());
        restTemplate.setInterceptors(interceptors);
        //配置自定义的异常处理
        restTemplate.setErrorHandler(new CustomResponseErrorHandler());
        restTemplate.setRequestFactory(simleClientHttpRequestFactory);

        return restTemplate;
    }

    @Bean
    public ClientHttpRequestFactory simleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory reqFactory= new SimpleClientHttpRequestFactory();
        reqFactory.setConnectTimeout(restTemplateConnectionTimeout);
        reqFactory.setReadTimeout(restTemplateReadTimeout);
        return reqFactory;
    }
}
