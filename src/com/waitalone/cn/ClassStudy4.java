package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-08 15:47
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy4 {
    public static void main(String[] args) {
        PersonStructure p = new PersonStructure();
        PersonStructure p1 = new PersonStructure("wukong");
        PersonStructure p2 = new PersonStructure("nezha", 3);
        p2.setName("jinzha");
        System.out.println(p2.getName());
    }
}

class PersonStructure {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;

    /*构造代码块
    * 作用：给对象进行初始化。对象一建立就运行，而且优先于构造函数
    * 和构造函数区别：
    * 构造代码块给所有对象进行统一初始化，而构造函数是给对应的对象初始化。
    * 用于定义共性的内容,比如孩子一出生都哭
    * */
    {
        System.out.println("这个是构造代码块！孩子Cry....");
    }

    PersonStructure() {
        /* 构造函数特点：
         * 函数名与类名相同
         * 不用定义返回值类型
         * 不可以写return语句
         * 作用：给对象进行初始化
         * 当没有定义构造函数时，系统会默认给该类加一个空参数的构造函数:
         * PersonStructure(){}
         * 当在类中自定义了构造函数后，默认的构造函数就没有了。
         * 构造函数和一般函数在写法上不同
         * 构造函数在对象一建立就运行，给对象初始化
         * 而一般方法，对象调用才执行，是给对象添加对象具备的功能。
         * 一个对象建议，构造函数只运行一次，而一般方法可被该对象执行多次
         * 什么时候定义构造函数？
         * 当分析事物时，该事物具备一些特性或者行为，那么将这些内容定义在构造函数中
         * */
        // System.out.println("我是构造函数,对象new一次就运行一次");
        System.out.println("构造函数A：name=" + name + "，age=" + age);
    }

    PersonStructure(String n) {
        name = n;
        System.out.println("构造函数B：name=" + name + "，age=" + age);
    }

    PersonStructure(String n, int a) {
        name = n;
        age = a;
        System.out.println("构造函数C：name=" + name + "，age=" + age);
    }
}