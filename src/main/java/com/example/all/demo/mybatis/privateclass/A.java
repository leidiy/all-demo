package com.example.all.demo.mybatis.privateclass;

import lombok.Data;

@Data
public class A {

    private int age;
    private A.B b;

    @Data
    public class B {

        private String name;
    }
}
