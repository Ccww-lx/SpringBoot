package com.cn.ccww.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

/**
 * @Auther: ccww
 * @Date: 2019/10/2 10:25
 * @Description: 
 */
public class PasswordService {
    //第三方系统获取密码所需的key
    private String objectKey;
    @Autowired
    private ThirdPartySystemService thirdPartySystemService;

    public String getSystemPassword(String objectKey,String originalPassord){

            if(StringUtils.isEmpty(objectKey)){
                return  originalPassord;
            }
            //从第三方系统获取密码
            String password= thirdPartySystemService.getPassword(objectKey);
            //返回密码
            return password!=null?password:originalPassord;

    }
}
