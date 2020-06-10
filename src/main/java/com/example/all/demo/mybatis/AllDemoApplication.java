package com.example.all.demo.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 使用BeanchMark进行基测
 *
 * @author 72082934
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@SpringBootApplication
public class AllDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllDemoApplication.class, args);
    }

}
