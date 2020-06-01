package com.example.all.demo.mybatis.singleton;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 并发测试
 *
 * @author 72082934
 */
public class RuntimeTest {

    public static void main(String[] args) {
        SingletonManager manager = new SingletonManager();
        int count = 100;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(count);
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            executorService.execute(() -> {
                manager.registerSingleton("key", "val" + new Random().nextInt(10));
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println(manager.getValue("key"));
    }


}