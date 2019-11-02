package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-14 15:37
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy10 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        Person1.show();
    }
}

/*
 * 什么时候使用静态？
 * 从两个方面下手，因为静态修饰的是静态成员和函数
 * 什么时候定义静态变量(类变量)呢？
 * 当对象中出现共享数据时，该数据被静态所修饰，对象中的特有数据要定义成非静态存在于堆满内存中
 *
 * 什么时候定义静态函数呢？
 * 当功能内部没有访问到非静态数据(对象的特有数据),那么该项功能可以定义为静态的
 * */
class Person1 {
    String name;

    public static void show() {
        System.out.println("haha");
        //没有访问到name，所以可以使用static
    }
}