package com.cn.ccww.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @Auther: ccww
 * @Date: 2019/10/9 20:48
 * @Description: 
 */
@Document(collection = "user")
public class UserDTO {
    private String userName;
    private String userAge;
    private String userSex;
    private String userMail;
    private List<AddressDTO> addressDTOS;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public List<AddressDTO> getAddressDTOS() {
        return addressDTOS;
    }

    public void setAddressDTOS(List<AddressDTO> addressDTOS) {
        this.addressDTOS = addressDTOS;
    }
}
