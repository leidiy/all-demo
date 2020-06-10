package com.example.all.demo.mybatis.service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * ServiceLoader的使用
 */
public class Test {
    public static void main(String[] args) {
        final ServiceLoader<PayService> payserives = ServiceLoader.load(PayService.class);
        final Iterator<PayService> iterator = payserives.iterator();
        while (iterator.hasNext()) {
            iterator.next().pay();
        }
    }
}
