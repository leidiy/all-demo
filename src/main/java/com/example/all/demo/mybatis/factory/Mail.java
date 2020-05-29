package com.example.all.demo.mybatis.factory;

public class Mail implements Sender {
    @Override
    public void send() {
        System.out.println("邮件发送拉");
    }
}
