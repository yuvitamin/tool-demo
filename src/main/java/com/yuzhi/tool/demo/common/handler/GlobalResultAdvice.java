package com.yuzhi.tool.demo.common.handler;

import com.yuzhi.tool.demo.common.result.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 全局的结果集处理
 * @author yuzhi
 */
@RestControllerAdvice
@Slf4j
public class GlobalResultAdvice  implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        log.error("supports");
        //为false 将不执行下面的aop方法
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        Object resp = null;
        //判断返回值boby是否是BaseResult的实例
        if (body instanceof BaseResult){
            resp = body;
        }else{
            resp =  BaseResult.success(body);
        }

        return resp;
    }
}