package com.example.all.demo.mybatis.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 单利管理者
 */
public class SingletonManager {
    private static Map<String, Object> manage = new HashMap<>();

    public SingletonManager() {
    }

    public void registerSingleton(String key, Object instance) {
        manage.computeIfAbsent(key, k -> instance);
    }

    public Object getValue(String key) {
        return manage.get(key);
    }


}
