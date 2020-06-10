package com.example.all.demo.mybatis.controller;

import com.example.all.demo.mybatis.spring.anotation.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/testJson")
    public void testJson(Person person) {
        System.out.println(person);
    }

    @InitBinder
    public void init() {

    }
}
