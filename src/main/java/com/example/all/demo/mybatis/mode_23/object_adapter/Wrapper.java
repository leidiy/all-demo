package com.example.all.demo.mybatis.mode_23.object_adapter;

/**
 * 对象适配器模式
 *
 * @author 72082934
 */
public class Wrapper implements Targetable {
    private Source source;


    public Wrapper() {
        
    }

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2 ");
    }


    public static void main(String[] args) {
        Targetable target = new Wrapper(new Source());
        target.method1();
        target.method2();
    }
}
