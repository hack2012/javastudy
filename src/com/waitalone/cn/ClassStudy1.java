package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-09-30 17:26
 * @Blog: https://www.waitalone.cn
 */
class Car {
    // 需求：描述汽车(颜色，轮胎数)。描述事物其实就是在描述事物的属性和行为
    // 属性对应类中的变量，行为对应类中的函数(方法)
    // 定义类就是在定义属性和行为；属性和行为共同成为类中的成员(成员变量和成员方法)
    /*
    成员变量和局部变量区别
    作用范围：成员变量作用于整个类，局部变量作用于函数中或者语句中
    在内存中的位置：成员变量在堆内存中，因为对象的存在，才在内存中存在,局部变量存在于栈内存中
    */

    // 描述颜色
    String color = "红色";
    // 描述轮胎数
    int num = 4;

    // 运行行为
    void run() {
        System.out.println(color + ".." + num);
    }
}

public class ClassStudy1 {
    public static void main(String[] args) {
        // 生产汽车在Java中就是用new操作符完成
        // 其实是在堆内存中产生一个实体
        // c变量一个类类型变量。记住类类型变量指向对象。
        Car c = new Car();
        // 需求将已有车的颜色改为蓝色
        c.color = "蓝色";
        c.run();
        Car c1 = new Car();
        // 注意观察c,c1的变化
        c1.run();
    }

}

