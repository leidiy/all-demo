package com.example.all.demo.mybatis.spring.anotation;

import com.example.all.demo.mybatis.spring.anotation.bean.Person;
import com.example.all.demo.mybatis.spring.anotation.configurable.TestConfigurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(MyConfig.class);
        final Person per = cxt.getBean("p", Person.class);
        System.out.println(per);

        final TestConfigurable testConfigurable = new TestConfigurable();
        System.out.println(testConfigurable);
    }
}
