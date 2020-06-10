package com.example.all.demo.mybatis.spring.anotation;

import com.example.all.demo.mybatis.builder.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 相当于xml的beans 节点
 */
@Configuration
public class MyConfig {

    /**
     * 相当于xml中的单个bean配置,id为方法名
     */
    @Bean
    public Person per() {
        return new Person();
    }

}
