package com.cn.ccww.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ccww on 2019/9/28.
 */
//通过@ConfigurationProperties加载properties文件属性
//可使用perfix前缀指定加载properties文件属性，通过location加载指定文件
@ConfigurationProperties(prefix = "project")
@Configuration
public class AutoConfigurationProperties {
    @Value("${project.name}")
    private String projectName;
    @Value("project.author")
    private String projectAuthor;

    public String getServerInfo() {
        System.out.println("projectName:" + projectName + "projectAuthor:" + projectAuthor);
        return "projectName:" + projectName  +" ----" + "projectAuthor:" + projectAuthor;
    }
}
