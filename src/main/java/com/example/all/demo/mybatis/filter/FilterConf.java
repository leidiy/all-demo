package com.example.all.demo.mybatis.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Filter config
 *
 * @author 72082934
 */
@Component
public class FilterConf {

    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new WebFilter());
        registration.addUrlPatterns("/*");
        registration.setName("webFilter");
        registration.setOrder(1);
        return registration;
    }
}
