package com.cn.ccww.configuration;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Auther: ccww
 * @Date: 2019/10/5 15:10
 * @Description: 
 */
@Configuration
//加上@EnableWebMvc将废弃到Spring boot默认配置，完全由自己去控制MVC配置，但通常是Spring boot默认配置+所需的额外MVC配置，
//只需要配置类继承
//@EnableWebMvc
public class WebMvcConfig  extends WebMvcConfigurerAdapter{
}
