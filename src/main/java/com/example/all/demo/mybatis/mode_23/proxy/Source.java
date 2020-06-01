package com.example.all.demo.mybatis.mode_23.proxy;

import com.example.all.demo.mybatis.mode_23.decorator.Sourceable;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is a original method");
    }
}
