package com.cn.ccww.dto;

/**
 * @Auther: ccww
 * @Date: 2019/10/4 11:15
 * @Description:
 */
public class UserDTO {
    private String username;
    private String password;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
