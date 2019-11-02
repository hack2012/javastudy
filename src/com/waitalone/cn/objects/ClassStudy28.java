package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-26 09:57
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy28 {
    public static void main(String[] args) {
        // ZiDemo z = new ZiDemo();
        // z.method1();
        // z.method2();
        // z.method3();
        // 多态的特点
        // 在多态中成员函数的特点(重要，记住)：
        // * 在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，编译通过，如果没有编译失败。
        // * 在运行时：参阅对象所属的类中是否有调用的方法。
        // 简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。
        FuDemo f = new ZiDemo();
        f.method1();
        f.method2();
        // 在多态中成员变量的特点：无论编译和运行，都参考左边(引用型变量所属的类)
        System.out.println(f.num);
        ZiDemo z = new ZiDemo();
        System.out.println(z.num);
        // 在多态中静态成员函数的特点：无论编译和运行都参考左边。
        f.method4();
        FuDemo.method4();
    }
}

class FuDemo {
    int num = 5;

    void method1() {
        System.out.println("fu method_1");
    }

    void method2() {
        System.out.println("fu method_2");
    }

    static void method4() {
        System.out.println("fu method_4");
    }
}

class ZiDemo extends FuDemo {
    int num = 8;

    void method1() {
        System.out.println("zi method_1");
    }

    void method3() {
        System.out.println("zi method_3");
    }

    static void method4() {
        System.out.println("zi method_4");
    }
}