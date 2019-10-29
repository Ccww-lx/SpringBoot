package com.cn.ccww.component;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @Auther: ccww
 * @Date: 2019/10/25 22:48
 * @Description:   记录resttemplate访问信息
 */
@Slf4j
public class TrackLogClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        trackRequest(request,body);
        ClientHttpResponse httpResponse = execution.execute(request, body);
        trackResponse(httpResponse);
        return httpResponse;
    }

    private void trackResponse(ClientHttpResponse httpResponse)throws IOException {
        log.info("============================response begin==========================================");
        log.info("Status code  : {}", httpResponse.getStatusCode());
        log.info("Status text  : {}", httpResponse.getStatusText());
        log.info("Headers      : {}", httpResponse.getHeaders());
        log.info("=======================response end=================================================");
    }

    private void trackRequest(HttpRequest request, byte[] body)throws UnsupportedEncodingException {
        log.info("======= request begin ========");
        log.info("uri : {}", request.getURI());
        log.info("method : {}", request.getMethod());
        log.info("headers : {}", request.getHeaders());
        log.info("request body : {}", new String(body, "UTF-8"));
        log.info("======= request end ========");
    }
}
