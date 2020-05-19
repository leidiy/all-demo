package com.example.all.demo.mybatis.builder;

import java.io.Serializable;

/**
 * @author 72082934
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -6274315044631278014L;
    private Long id;
    private String name;
    private int age;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    Person() {
    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Person builder() {
        return new Person();
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Person.builder().name("zlx").age(190));
    }

}
