package com.cn.ccww.action;

import com.cn.ccww.dto.UserDTO;
import com.cn.ccww.service.BaseService;
import com.cn.ccww.configuration.AutoConfigurationProperties;
import com.cn.ccww.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ccww on 2019/9/30.
 */

//测试controller
@RestController
public class BaseController {
    @Autowired
    private BaseService baseService;
    @Autowired
    private AutoConfigurationProperties autoConfigurationProperties;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/ccww/index",method = RequestMethod.GET)
    public String index(){
        StringBuffer stringBuffer=new StringBuffer();
        //换行符
        String property = System.getProperty("line.separator");

        //测试 baseService
        String baseServiceInfo = baseService.addBaseServiceInfo("ccww", "公众号：ccww笔记");
        stringBuffer.append(baseServiceInfo).append(property);

        //测试userService
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("ccww");
        userDTO.setUserSex("girl");
        userDTO.setUserAge("18");
        userDTO.setUserAddress("China");
        String userInfo = userService.addUserInfo(userDTO);
        stringBuffer.append(userInfo).append(property);

        //测试autoConfigurationProperties
        String serverInfo = autoConfigurationProperties.getServerInfo();
        stringBuffer.append(serverInfo);

        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    /**
     * test 自定义starter
     * @return
     */
    @RequestMapping(value = "/ccww/getPassword",method = RequestMethod.GET)
    public String getPassword(){
        String password = baseService.testPassorsStarter();
        System.out.println(password);
        return password;
    }
}
