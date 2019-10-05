package com.cn.ccww.service;

import com.cn.ccww.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @Auther: ccww
 * @Date: 2019/10/4 11:49
 * @Description: 
 */
@Service
public class LoginService {
   public UserDTO login(String username, String password){
       //todo 从数据源获取user数据进行检验

       UserDTO userDTO = new UserDTO();
       userDTO.setUsername(username);
       userDTO.setPassword(password);
       userDTO.setMessage("login success");
       return  userDTO;
   }
}
