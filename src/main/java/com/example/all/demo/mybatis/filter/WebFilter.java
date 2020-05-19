package com.example.all.demo.mybatis.filter;

import javax.servlet.*;
import java.io.IOException;


/**
 * 一些简单的过滤操作
 *
 * @author
 */
//注解是在扫包的基础上才能生效
//@javax.servlet.annotation.WebFilter(urlPatterns = {"/"}, filterName = "webFilter")
// @ServletComponetScan("com.example...filter")
public class WebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 一些编码工作
        ServletContext servletContext = servletRequest.getServletContext();
        servletContext.setAttribute("动态", "我是一个动态的内容");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
