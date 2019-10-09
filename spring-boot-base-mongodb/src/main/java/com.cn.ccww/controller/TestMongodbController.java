package com.cn.ccww.controller;

import com.cn.ccww.dto.UserDTO;
import com.cn.ccww.service.MongodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ccww
 * @Date: 2019/10/9 20:50
 * @Description:
 */
@RestController
public class TestMongodbController {
    @Autowired
    private MongodbService mongodbService;

    @RequestMapping("/save")
    public void save(@RequestBody UserDTO userDTO) {
        mongodbService.save(userDTO);
    }
}
