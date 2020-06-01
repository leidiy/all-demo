package com.example.all.demo.mybatis.mode_23.decorator;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("decorator this is a method");
    }
}
