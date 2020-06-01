package com.example.all.demo.mybatis.mode_23.proxy;

/**
 * 代理模式的应用场景：
 *
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
 *
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 * @author 72082934
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
    }

    public Proxy(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before source method");
        source.method();
        System.out.println("after source method");

    }


    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Source());
        proxy.method();
    }
}

/**
 * 装饰器、代理模式的区别
 * 使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造
 */
