package com.cn.ccww.configuration;

import com.cn.ccww.condition.WindowsCondition;
import com.cn.ccww.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ccww on 2019/9/30.
 */
//类中组件统一设置。满足当前条件，类配置才能生效；
@Conditional(WindowsCondition.class)
@Configuration
public class BaseConfiguration {

    @Bean("userService")
    public UserService getUserService(){
        System.out.println("在容器中添加UserService....");
        return new UserService();
    }
}
