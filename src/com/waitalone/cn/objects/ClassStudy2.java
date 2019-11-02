package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-09-30 17:26
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy2 {
    public static void main(String[] args) {
        // 匿名对象 调用对象是无意义的
        new Car().num = 5;
        new Car().color = "blue";
        new Car().run();
        // 匿名对象使用方式1
        // 当对对象的方法只调用一次时，可以使用匿名对象，这样写比较简化
        // 如果对一个对象进行多个成员调用则必须给这个对象起个名字
        // 匿名对象使用方式2
        // 可以将匿名对象作为实际参数进行传递
        // Car q = new Car();
        // show(q);
        show(new Car());
    }

    // 汽车修配厂，对汽车进行改装，将汽车都改为黑色，3个轮胎。
    public static void show(Car c) {
        c.num = 3;
        c.color = "black";
        c.run();
    }
}
