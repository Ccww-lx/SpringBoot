package com.cn.ccww.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by ccww on 2019/9/30.
 */
//判断是否linux系统
public class LinuxCondition implements Condition {

    private final static String LINUX="linux";
    /**
     * ConditionContext：判断条件能使用的上下文（环境）
     * AnnotatedTypeMetadata：注释信息
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // TODO是否linux系统
        //1、能获取到ioc使用的beanfactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //2、获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        //3、获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //4、获取到bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        boolean definition = registry.containsBeanDefinition("baseService");
        if(definition){
            System.out.println("baseService is exits");
        }
        String property = environment.getProperty("os.name");
        if(property.contains(LINUX)){
            return true;
        }
        return false;
    }
}
