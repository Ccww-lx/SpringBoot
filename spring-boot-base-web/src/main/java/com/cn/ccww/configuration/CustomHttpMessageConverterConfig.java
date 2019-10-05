package com.cn.ccww.configuration;

import com.cn.ccww.component.UserJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/** 注册自定义的HttpMessageConverter到HttpMessageConverters中
 * @Auther: ccww
 * @Date: 2019/10/5 14:24
 * @Description: 
 */
@Configuration
public class CustomHttpMessageConverterConfig {
    @Bean
    public HttpMessageConverters converter(){
        HttpMessageConverter<?> userJsonHttpMessageConverter=new UserJsonHttpMessageConverter();
        return new HttpMessageConverters(userJsonHttpMessageConverter);
    }
}