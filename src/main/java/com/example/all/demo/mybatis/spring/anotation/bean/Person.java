package com.example.all.demo.mybatis.spring.anotation.bean;

import lombok.Data;

import java.io.Serializable;

@Data
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


}
