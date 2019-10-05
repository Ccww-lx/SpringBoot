package com.cn.ccww.component;

import com.cn.ccww.dto.UserDTO;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * 自定义HttpMessageConverter
 * @Auther: ccww
 * @Date: 2019/10/5 14:02
 * @Description: 
 */
public class UserJsonHttpMessageConverter extends AbstractHttpMessageConverter<UserDTO> {
    private static Charset DEFUALT_ENCODE=Charset.forName("UTF-8");
    public UserJsonHttpMessageConverter(){
        super(new MediaType("application", "xxx-ccww", DEFUALT_ENCODE));
    }
    protected boolean supports(Class aClass) {
            return UserDTO.class == aClass;
    }

    protected UserDTO readInternal(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String message = StreamUtils.copyToString(httpInputMessage.getBody(), DEFUALT_ENCODE);
        String[] messages = message.split("-");
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(messages[0]);
        userDTO.setMessage(messages[1]);
        return userDTO;
    }

    protected void writeInternal(UserDTO userDTO, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "ccww: " + userDTO.getUsername() + "-" + userDTO.getMessage();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
