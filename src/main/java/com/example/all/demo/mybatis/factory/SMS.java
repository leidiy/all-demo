package com.example.all.demo.mybatis.factory;

public class SMS implements Sender {
    @Override
    public void send() {
        System.out.println("SMS发送拉");
    }
}
