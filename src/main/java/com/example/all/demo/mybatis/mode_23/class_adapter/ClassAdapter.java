package com.example.all.demo.mybatis.mode_23.class_adapter;

/**
 * 类的适配器模式
 *
 * @author 72082934
 */
public class ClassAdapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is a method2");
    }


    public static void main(String[] args) {
        Targetable target = new ClassAdapter();
        target.method1();
        target.method2();
    }
}
