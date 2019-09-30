package com.cn.ccww.condition;

import com.cn.ccww.service.BaseWindowsService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by ccww on 2019/9/30.
 */

//判断是否windows系统
public class WindowsCondition implements Condition {

    private final static String WINDOWS="Windows";

    /**
     * ConditionContext：判断条件能使用的上下文（环境）
     * AnnotatedTypeMetadata：注释信息
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取当前环境变量
        Environment environment=conditionContext.getEnvironment();
        //获取bean注册器
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        //能获取到ioc使用的beanfactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //获取环境变量中操作系统
        String property = environment.getProperty("os.name");
        //判断操作系统是否为windows
        if(property.contains(WINDOWS)){
            //判断是否存在baseWindowsSevice类，不存在则进行bean注册
            boolean isWindowsSevice = registry.containsBeanDefinition("baseWindowsSevice");
            if(!isWindowsSevice){
                //指定Bean定义信息；（Bean的类型，Bean的一系列信息）
                RootBeanDefinition beanDefinition = new RootBeanDefinition(BaseWindowsService.class);
                //注册一个Bean，指定bean名
                registry.registerBeanDefinition("baseWindowsSevice", beanDefinition);
                BaseWindowsService windowsSevice = (BaseWindowsService)beanFactory.getBean("baseWindowsSevice");
                windowsSevice.addServiceName("ccww---baseWindowsSevice");
            }
            return true;
        }
        return false;
    }
}
