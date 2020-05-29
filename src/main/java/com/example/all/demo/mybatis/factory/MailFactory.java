package com.example.all.demo.mybatis.factory;

public class MailFactory implements Provider {
    
    @Override
    public Sender provide() {
        System.out.println("MailFacotry provide");
        return new Mail();
    }
}
