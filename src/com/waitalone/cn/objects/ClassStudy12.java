package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-14 18:23
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy12 {
    static {
        System.out.println("测试1,静态代码块，给类初始化！");
    }

    public static void main(String[] args) {
        // new StaticCode();
        // new StaticCode();
        // 这个不会再执行打印了。
        // System.out.println("执行完毕，收工！");
        //输出结果是 测试1 测试1 我是静态代码块，我只执行1次 执行完毕，收工！
        //因为静态优先于主函数执行
        // StaticCode.show();
        new StaticCode();
        // new StaticCode(4);
    }

    static {
        System.out.println("测试2");
    }
}

class StaticCode {
    //非静态变量，无法给静态代码块使用，可以给对象代码块使用
    int num = 9;
    //静态变量，可以给静态代码块和对象使用，静态只能调用静态
    static int num2 = 10;


    StaticCode() {
        System.out.println("我是空参数构造函数，给对应对应初始化！");
    }

    //静态代码块，随着类的加载而执行，只执行一次。
    static {
        //静态代码块中的执行语句
        System.out.println("我是静态代码块，给类初始化，我只执行1次。" + num2);
    }

    {
        System.out.println("我是构造代码块，给对象初始化的。" + num);
    }

    StaticCode(int x) {
        System.out.println("我是构造函数，给对应对象初始化：x=" + x);
    }

    public static void show() {
        System.out.println("show");
    }
}