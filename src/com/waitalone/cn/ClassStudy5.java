package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-08 16:51
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy5 {
    public static void main(String[] args) {
        Person2 p = new Person2("lisi");
        Person2 p1 = new Person2("zhangsan");
        p.speak();
        p1.speak();
    }
}

class Person2 {
    private String name;
    private int age;

    Person2(String name) {
        // name = name将导致name=null，必须修改为this.name = name;
        // name = n的话就可以获取到正确的值
        // 当局部变量和成员变量重名时，或局部变量中有，则从局部变量中找
        /*this：看上去是用于区分局部变量和成员变量同名情况
         * this 代表的是什么，为什么能解决这个问题？
         * this 代表本类的对象，到底代表哪一个？
         * this 代表它所在函数所属对象的引用
         * 哪个对象在调用this所在的函数，this就代表哪个对象
         * */
        // Person2 p = new Person2("lisi"); 这时this就代表p，但不能直接写成p
        this.name = name;
    }

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        // 这里的name 其实是this.name的简写
        System.out.println("name=" + name + ", age=" + age);
    }
}