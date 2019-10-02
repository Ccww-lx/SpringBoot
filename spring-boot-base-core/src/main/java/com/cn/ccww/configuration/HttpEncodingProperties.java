package com.cn.ccww.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * Created by ccww on 2019/9/28.
 */
//在application.properties配置的时候前缀是spring.http.encoding
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {
    //默认编码方式为UTF-8
    public static final Charset DEFAULT_CHARSET=Charset.forName("UTF-8");
    //可以通过spring.http.encoding.charset进行设置
    private Charset charset=DEFAULT_CHARSET;
    //设置默认值
    private boolean force=true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
