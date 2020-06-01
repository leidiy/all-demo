package com.example.all.demo.mybatis.mode_23.iterator;

/**
 * 自定义Collection 实现类
 */
public class MyCollection implements Collection {
    public String string[];

    public MyCollection() {
    }

    public MyCollection(String[] string) {
        this.string = string;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
