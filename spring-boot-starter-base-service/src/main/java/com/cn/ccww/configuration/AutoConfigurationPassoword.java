package com.cn.ccww.configuration;/**
 * Created by Adminn on 2019/10/2.
 */

import com.cn.ccww.condition.WindowsCondition;
import com.cn.ccww.service.BaseStarterService;
import com.cn.ccww.service.PasswordService;
import com.cn.ccww.service.ThirdPartySystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: ccww
 * @Date: 2019/10/2 10:41
 * @Description: 
 */
@Configuration
//自动加载配置文件属性值
@EnableConfigurationProperties(BaseServiceProperties.class)
@Import(BeanConfiguration.class)
//判断当前环境是否为windows
@Conditional(WindowsCondition.class)
//判断属性spring.project.ThirdPartySystemService.isPassword是否等于true
@ConditionalOnProperty(prefix = "spring.project.ThirdPartySystemService",value = "enablePassword", havingValue = "true",matchIfMissing = true)
public class AutoConfigurationPassoword {
    @Autowired
    private BaseServiceProperties baseServiceProperties;
    @Autowired
    private BaseStarterService baseWindowsService;

    //加载第三方系统service
    @Bean("thirdPartySystemService")
    public ThirdPartySystemService thirdPartySystemService(){
        baseWindowsService.addServiceName(baseServiceProperties);
        return new ThirdPartySystemService();
    }
    @Bean
    //判断IOC容器中是否存在ThirdPartySystemService类，存在则创建PasswordService bean
    @ConditionalOnClass(ThirdPartySystemService.class)
    public PasswordService passwordService(){
        baseWindowsService.addServiceName(baseServiceProperties);
        return new PasswordService();
    }
}
