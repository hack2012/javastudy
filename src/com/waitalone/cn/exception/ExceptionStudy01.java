package com.waitalone.cn.exception;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-11-02 14:30
 * @Blog: https://www.waitalone.cn
 */
public class ExceptionStudy01 {
    public static void main(String[] args) {
        ExceptionDemo1 d = new ExceptionDemo1();
        int x = d.div(4, 1);
        System.out.println("x=" + x);
        System.out.println("ove");
    }
}

/*异常就是程序在运行时出现的不正常情况
 * 异常的由来：问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述，并封装成对象。
 *           其实就是java对不正常情况进行描述后的对象体现
 * 对于问题的划分：1、一种是严重的问题 2、非严重的问题
 * 对于严重的：java通过Error类进行描述，对于Error一般不编写针对性的代码进行处理
 * 对于非严重的，java通过Exception类进行描述，对于Exception可以使用针对性的处理方式进行处理
 *
 * 无论Error或者Exception都有一些共性内容
 * 比如：不正常情况的信息，引发原因等。
 * Throwable
 *    |---Error
 *    |---Exception
 * */

class ExceptionDemo1 {
    int div(int a, int b) {
        return a / b;
    }
}