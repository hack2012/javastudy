package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 11:03
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy13 {
    public static void main(String[] args) {
        PersonDemo4 p = new PersonDemo4("zhangsan", 10);
        /* 该句话都做了什么事情？
        * 1、因为new了PersonDemo4所以会先找到PersonDemo4.class并加载到内存中。
        * 2、执行该项类中的static代码块，如果有的话，给PersonDemo4.class类初始化。
        * 3、在堆内存中开辟空间，分配内存地址。
        * 4、在堆内存中建立对象的特有属性并进行默认初始化。
        * 5、对属性进行显式初始化。
        * 6、对对象进行构造代码块初始化。
        * 7、对对象进行与之对应的构造函数初始化。
        * 8、将内存地址赋给栈内存中的p变量
        * */
    }
}

class PersonDemo4 {
    private String name;
    private int age;
    private static String country = "CN";

    PersonDemo4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    {
        System.out.println(name + "...." + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(this.name + "...." + this.age);
    }

    public static void showCountry() {
        System.out.println("Country=" + country);
    }
}