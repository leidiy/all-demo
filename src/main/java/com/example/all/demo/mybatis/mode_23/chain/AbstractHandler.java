package com.example.all.demo.mybatis.mode_23.chain;

public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    
}
