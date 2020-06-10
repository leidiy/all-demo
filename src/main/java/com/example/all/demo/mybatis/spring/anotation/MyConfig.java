package com.example.all.demo.mybatis.spring.anotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 相当于xml的beans 节点
 *
 * @author 15871
 */
@Configuration
// 两种方式，一种不扫包，另一种扫包
@ComponentScan("com.example.all.demo.mybatis.spring.anotation")
public class MyConfig {

    /**
     * 相当于xml中的单个bean配置,id为方法名
     //     */
//    @Bean(name = "p")
//    public Person per() {
//        return new Person();
//    }


}
