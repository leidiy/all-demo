package com.example.all.demo.mybatis.factory;

public class Test {
    public static void main(String[] args) {
        Provider provider = new MailFactory();
        Sender sender = provider.provide();
        sender.send();

        
    }
}
