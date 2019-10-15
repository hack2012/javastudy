package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 14:58
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy16 {
    public static void main(String[] args) {
        /*将学生和工人的共性描述提取出来，单独进行描述
         * 只要让学生和工人与单独描述的这个类有关系就可以了
         * 继承：
         * 1、提供了代码的复用性
         * 2、让类与类之间产生了关系，有了这个关系才有了多态的特性
         * 注意：
         * 千万不要为了获取其它类的功能，简化代码而继承
         * 必须是类与类之间有所属关系才继承，所属关系is a
         * java只支持单继承，不支持多继承，因为多继承容易带来安全隐患。
         * 隐患：当父类中定义了相同功能，但功能内容不同时，子类对象不确定要运行哪一个。
         * java保留了多继承机制，但是用了另一种表现形式->多实现
         * Java支持多层继承，爷爷->父亲->儿子-孙子之类的
         *
         * 如何使用一个继承体系中的功能？
         * 想要使用体系，先查阅体现中父类的描述，因为父类中定义的是该体系中的共性功能，
         * 通过了解共性功能就可以知道该体系的基本功能。
         * 那么在调用时，要创建最子类的对象，为什么呢？
         * 1、有可能父类不能创建对象
         * 2、创建子类对象可以使用更多的功能，包括基本的也包括特有的。
         * */
        Student s = new Student();
        s.name = "zhangsan";
    }
}

class Person3 {
    String name;
    int age;
}

class Student extends Person3 {
    void study() {
        System.out.println("Good Good Study");
    }
}

class Worker extends Person3 {
    void work() {
        System.out.println("Good work");
    }
}