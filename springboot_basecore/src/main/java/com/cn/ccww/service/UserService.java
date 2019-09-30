package com.cn.ccww.service;

import com.cn.ccww.dto.UserDTO;

/**
 * Created by ccww on 2019/9/30.
 */
public class UserService {

    private UserDTO user;

    public String addUserInfo(UserDTO user) {
        this.user = user;
        System.out.println(user.toString());
        return user.toString();
    }
}
