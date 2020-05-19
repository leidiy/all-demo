package com.example.all.demo.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 72082934
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public Object hello() {
        return "ok";
    }
}
