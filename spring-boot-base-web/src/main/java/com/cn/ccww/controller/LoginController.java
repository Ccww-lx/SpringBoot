package com.cn.ccww.controller;

import com.cn.ccww.dto.UserDTO;
import com.cn.ccww.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: ccww
 * @Date: 2019/10/4 11:13
 * @Description:
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 将首页设置为登陆页面login.html
     * @return
     */
    @RequestMapping("/")
    public String startIndex() {
        return "login";
    }

    /**
     *  登陆验证
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        UserDTO userDTO = loginService.login(username, password);
        model.addAttribute("user", userDTO);
        return "index";
    }
}
