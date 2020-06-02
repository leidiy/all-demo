package com.example.all.demo.mybatis.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person.setAge(1);
        person2.setAge(3);
        person2.setName("2");
        person3.setName("3");
        person3.setAge(3);

        List<Person> ps = Arrays.asList(person, person2,person3);
        // test1
        List<Person> collect = ps.stream().sorted((a, b) -> (a.getAge() - b.getAge() >= 0) ? -1 : 1).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("----------------------------------------");
        // test2
        Collections.sort(ps,new PersonComp());
        System.out.println(ps);

    }


    /**
     *  针对于方法的比较器
     */
    static class PersonComp implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge() >=0 ? -1 : 1;
        }
    }



}
