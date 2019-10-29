package com.cn.ccww.controller;

import com.cn.ccww.service.TestRestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ccww
 * @Date: 2019/10/28 16:39
 * @Description:
 */
@RestController
public class TestController {
    @Autowired
    private TestRestTemplateService testRestTemplateService;

    @RequestMapping("/test/testRestTemplate")
    public void testRestTemplate()throws Exception{
        testRestTemplateService.testRestTemplate();;
    }
}
