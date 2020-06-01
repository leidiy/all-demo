package com.example.all.demo.mybatis.mode_23.chain;

public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("name" + name + "deal");
        if (null == getHandler()) {
            return;
        }

        getHandler().operator();
    }
}
