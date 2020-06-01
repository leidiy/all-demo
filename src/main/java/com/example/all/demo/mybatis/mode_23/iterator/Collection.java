package com.example.all.demo.mybatis.mode_23.iterator;

/**
 *  自定义集合
 */
public interface Collection {

    Iterator iterator();

    Object get(int i);

    int size();


}
