package com.cn.ccww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ccww on 2019/9/28.
 */
@SpringBootApplication(scanBasePackages = {"com.cn.ccww.*"})
public class BaseSpringBootApplication {

    public static void main(String[] args) {

        //关闭banner
        SpringApplication application = new SpringApplication(BaseSpringBootApplication.class);
        //application.setBannerMode(Banner.Mode.OFF);
        application.run();
        //使用fluent API修改
       /* new SpringApplicationBuilder(BaseSpringBootApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run();*/

    }
}
