package com.example.all.demo.mybatis.spring.anotation.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Data
@Component("p")
public class Person implements Serializable {
    private static final long serialVersionUID = -7114591519398044999L;

    /**
     * age
     */
    private Integer age;

    /**
     * name
     */
    private String name;


    /**
     * enable
     */
    private Boolean enable;


    private Date time;

}
