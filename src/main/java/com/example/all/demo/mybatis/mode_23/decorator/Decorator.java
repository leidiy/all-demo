package com.example.all.demo.mybatis.mode_23.decorator;

/**
 * 装饰模式（Decorator） 动态扩展功能
 * 
 * 装饰器模式的应用场景：
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 *
 * 缺点：产生过多相似的对象，不易排错！
 * @author 72082934
 */
public class Decorator implements Sourceable {
    private Source source;

    public Decorator() {
    }

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before source method");
        source.method();
        System.out.println("after source method");
    }


    public static void main(String[] args) {
        Source source = new Source();
        Sourceable sourceable = new Decorator(source);
        sourceable.method();
    }
}
