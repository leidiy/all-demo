package com.example.all.demo.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 72082934
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public Object hello(HttpServletRequest request) {
        ServletContext servletContext = request.getServletContext();
        System.out.println(servletContext.getAttribute("动态"));
        return "ok";
    }
}
