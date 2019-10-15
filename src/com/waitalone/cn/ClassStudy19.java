package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 17:12
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy19 {
    public static void main(String[] args) {
        //子父类中的构造函数
        /*在对子类对象初始化时，父类的构造函数也会运行，那是因为子类的构造函数第1条有一条隐式的语句叫super();
         * super();会访问父类中空参数的构造函数，而且子类中所有的构造函数默认第一行都是super();
         *
         * 为什么子类一定要访问父类中的构造函数？
         * 因为父类中的数据子类可以直接获取，子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的。
         * 所以子类在对对象初始化时，要先访问一下父类中的构造函数
         * 如果要访问父类中指定的构造函数，可以通过手动定义super语句的方式指定
         *
         * 子类的实例化过程
         * 子类中所有构造函数默认都会访问父类中空参数的构造函数，因为子类每一个构造函数内的第一行都有一个隐式的super();
         * 当父类中没有空参数的构造函数时，子类必须手动通过super或者this语句来指定要访问的父类中的构造函数
         * 当然子类的构造函数第一行也可以手动指定this语句来访问子类中的构造函数，子类中至少会有一个构造函数会访问父类中的构造函数
         * */
        Zi2 z = new Zi2();
        Zi2 z1 = new Zi2(4);
    }
}

class Fu2 {
    Fu2() {
        System.out.println("fu run");
    }
}

class Zi2 extends Fu2 {
    Zi2() {
        //super(); 隐式调用了，虚拟机添加的
        System.out.println("zi run");
    }

    Zi2(int x) {
        //super();
        System.out.println("zi...." + x);
    }
}