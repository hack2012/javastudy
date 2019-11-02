package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-09 10:08
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy6 {
    public static void main(String[] args) {
        PersonDemo p1 = new PersonDemo(20);
        PersonDemo p2 = new PersonDemo(20);
        boolean b = p1.compare(p2);
        System.out.println(b);
    }
}

class PersonDemo {
    private int age;
    private String name;

    // 需求：给人定义一个比较年龄是否相同的功能，也就是是否是同龄人
    PersonDemo(String name) {
        this.name = name;
    }

    PersonDemo(int age) {
        this.age = age;
    }

    PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public boolean compare(PersonDemo p) {
        // this的应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。
        // 但凡本类功能内部使用了本类对象，那么都用this表示。
        return this.age == p.age;
    }
}