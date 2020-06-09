package com.example.all.demo.mybatis.privateclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class A {

    private int age;
    private A.B b;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class B {
        private String name;
    }
}
