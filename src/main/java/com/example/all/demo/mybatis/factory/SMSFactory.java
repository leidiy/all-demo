package com.example.all.demo.mybatis.factory;

public class SMSFactory implements Provider {
    @Override
    public Sender provide() {
        System.out.println("SMSFacotry provide");
        return new SMS();
    }
}
