package com.cn.ccww.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ccww on 2019/9/28.
 */
//导入Spring的配置文件，让配置文件里面的内容生效
@ImportResource(locations = {"classpath:base.xml"})
@Configuration
public class LoadXmlFileConfiguration {
//加载base.xml文件下的bean到IOC容器中
}
