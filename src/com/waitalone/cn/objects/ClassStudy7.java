package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-09 10:27
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy7 {
    public static void main(String[] args) {
        PersonDemo2 p = new PersonDemo2("lisi", 20);
    }
}

class PersonDemo2 {
    private String name;
    private int age;

    PersonDemo2(String name) {
        this.name = name;
    }

    PersonDemo2(int age) {
        this.age = age;
    }

    PersonDemo2(String name, int age) {
        // this.name = name;
        // 构造函数间调用只能用this语句 相当于p(name)
        // this语句必须放在构造函数中第一行,初始化要先执行
        this(name);
        this.age = age;
    }
}