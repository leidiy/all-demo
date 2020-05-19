package com.example.all.demo.mybatis.privateclass;

/**
 * 测试private default、protected 的权限访问
 */
public class Test {

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.getB();
        b.setName("name");
    }
}
