# SpringBoot
<br>Spring boot教程系列
<br>一、SpringBoot核心
<br>demo实现，代码查看spring-boot-base-core模块,详情解析可查看:
<br>微信公众号[【Cc笔记】](https://mp.weixin.qq.com/s?__biz=MzU2ODk2NDMwNw==&mid=2247483847&idx=1&sn=06f48aff734f0f01d8f02caaca93a76a&chksm=fc84a47bcbf32d6d164339b0d5936a03f8c17b9633aaeeb0f29819b1469bb856024bada9b7a6&token=354407281&lang=zh_CN#rd)  
[掘金](https://juejin.im/post/5d8ece935188254d014e2e33)

SpringBoot运行原理：    
+ 入口类和@SpringBootApplication  
+ Starter pom  自定义Strater

核心注解：
+ 注解解析：比如：@ConditionOnBean、 @ConditionOnClass等
+ 自定义

基础配置：
+ banner配置
+ Spring Boot配置文件（properties、yaml）
+ xml文件配置

外部配置：
+ 命令行参数配置
+ 常规属性配置、类型安全的配置

日志配置：
+ 支持Log4J、Log4J2以及Logback（默认）

Profile配置：
+ 不同环境对应不同配置：application-{profile}.properties

<br>二、SpringBoot 自定义Starter
<br>demo实现，代码查看spring-boot-starter-base-service模块，详情解析可查看：
<br>微信公众号[【Cc笔记】](https://mp.weixin.qq.com/s?__biz=MzU2ODk2NDMwNw==&mid=2247483847&idx=1&sn=06f48aff734f0f01d8f02caaca93a76a&chksm=fc84a47bcbf32d6d164339b0d5936a03f8c17b9633aaeeb0f29819b1469bb856024bada9b7a6&token=354407281&lang=zh_CN#rd)  
[掘金](https://juejin.im/post/5d944202f265da5ba532a1d1)

SpringBoot Starter源码分析：@EnableAutoConfiguration源码分析  

条件注解：

注解|解析
:-|:-|
@ConditionalOnBean| 当容器里有指定的Bean的条件下。
@ConditionalOnClass| 当类路径下有指定的类的条件下。
@ConditionalOnExpression|基于SpEL表达式作为判断条件。
@ConditionalOnJava|基于JVM版本作为判断条件。
@ConditionalOnJndi|在JNDI存在的条件下查找指定的位置。
@ConditionalOnMissingBean|当容器里没有指定Bean的情况下。
@ConditionalOnMissingClass|当类路径下没有指定的类的条件下。
@ConditionalOnNotWebApplication|当前项目不是Web项目的条件下。
@ConditionalOnProperty|指定的属性是否有指定的值。
@ConditionalOnResource|类路径是否有指定的值。
@ConditionalOnSingleCandidate|当指定Bean在容器中只有一个， 或者虽然有多个但是指定首选的Bean。
@ConditionalOnWebApplicatio| 当前项目是Web项目的条件下。



三、Web开发中Thymeleaf、Web、Tomcat以及Favicon
<br>demo实现，代码查看spring-boot-base-web模块,详情解析可查看:
<br>微信公众号[【Cc笔记】](https://mp.weixin.qq.com/s?__biz=MzU2ODk2NDMwNw==&mid=2247483847&idx=1&sn=06f48aff734f0f01d8f02caaca93a76a&chksm=fc84a47bcbf32d6d164339b0d5936a03f8c17b9633aaeeb0f29819b1469bb856024bada9b7a6&token=354407281&lang=zh_CN#rd)  
[掘金](https://juejin.im/post/5d8ece935188254d014e2e33)

thymeleaf:原理以及源码分析
web包括：Formatter和Converter类型转换器、HttpMessageConverters (HTTP request (请求)和response (响应)的转换器)等等

最后可关注公众号：【Ccww笔记】 一起学习,每天会分享干货，还有学习视频领取！  

![](https://user-gold-cdn.xitu.io/2019/9/30/16d8122f554d8cfa?w=258&h=258&f=png&s=30701) 

