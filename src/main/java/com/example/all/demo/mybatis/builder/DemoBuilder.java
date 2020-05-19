package com.example.all.demo.mybatis.builder;

import java.io.Serializable;

/**
 * @author 72082934
 */
public class DemoBuilder implements Serializable {
    private static final long serialVersionUID = -7522630075930292006L;

    private String name;
    private Integer age;

    public DemoBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        public String name;

        public Integer age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public DemoBuilder build() {
            return new DemoBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "DemoBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        DemoBuilder builder = new Builder().name("zlx").age(19).build();
        System.out.println(builder);
    }


}
