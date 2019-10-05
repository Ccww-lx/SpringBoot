package com.cn.ccww.controller;

import com.cn.ccww.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义的HttpMessageConverter
 * @Auther: ccww
 * @Date: 2019/10/5 14:42
 * @Description: 
 */
@RestController
public class TestHttpMessageConverter {
    @RequestMapping("/getUser")
    public UserDTO getUser(@RequestBody UserDTO userDTO){
        return userDTO;
    }
}
