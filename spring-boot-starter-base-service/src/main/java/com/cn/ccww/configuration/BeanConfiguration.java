package com.cn.ccww.configuration;/**
 * Created by Adminn on 2019/10/2.
 */

import com.cn.ccww.service.BaseStarterService;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: ccww
 * @Date: 2019/10/2 12:58
 * @Description: 
 */
@Configuration
public class BeanConfiguration {
    public BaseStarterService baseStarterService(){
        return new BaseStarterService();
    }
}
