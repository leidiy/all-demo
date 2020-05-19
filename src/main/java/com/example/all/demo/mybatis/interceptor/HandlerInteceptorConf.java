package com.example.all.demo.mybatis.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 拦截器配置
 */
@Component
public class HandlerInteceptorConf extends WebMvcConfigurationSupport {
    @Autowired
    WebInterceptor webInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(webInterceptor).addPathPatterns("/**").order(1);
        super.addInterceptors(registry);

    }
}
