package com.example.all.demo.mybatis.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * compareable 是实现类的比较
 */
public class PersonComparator implements Comparable<PersonComparator> {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(PersonComparator o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return "PersonComparator{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        // test1
        PersonComparator p1 = new PersonComparator();
        PersonComparator p2 = new PersonComparator();
        p1.setAge(1);
        p2.setAge(3);
        List<PersonComparator> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        Collections.sort(list);
        System.out.println(list);

    }
}
