package com.cn.ccww.component;

import com.cn.ccww.dto.UserDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

/**
 * 将格式为 ccww：ccww88转为UserDTO
 *
 * @Auther: ccww
 * @Date: 2019/10/4 16:25
 * @Description:
 */
public class StringToUserConverter implements Converter<String, UserDTO> {
    @Nullable
    public UserDTO convert(String s) {
        UserDTO userDTO = new UserDTO();
        if (StringUtils.isEmpty(s))
            return userDTO;
        String[] item = s.split(":");
        userDTO.setUsername(item[0]);
        userDTO.setPassword(item[1]);
        return userDTO;
    }
}
