package com.example.all.demo.mybatis.mode_23.iterator;

public class Test {
    public static void main(String[] args) {
        String[] tests = new String[]{"a", "b", "c", "d"};
        Collection collection = new MyCollection(tests);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("collection index 2:" + collection.get(2));
    }
}
