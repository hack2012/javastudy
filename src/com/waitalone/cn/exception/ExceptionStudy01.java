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
        try {
            int x = d.div(4, 0);
            System.out.println("x=" + x);
        } catch (Exception e) {
            System.out.println("除零啦");
            System.out.println(e.getMessage());
            // 异常名称，异常信息
            System.out.println(e.toString());
            // 异常名称，异常信息，异常出现的位置
            // 其实jvm默认的异常处理机制，就是在调用printStackTrace方法
            e.printStackTrace();
        }
        System.out.println("ove");
    }
}

/*1、异常就是程序在运行时出现的不正常情况
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
 *
 * 2、异常的处理：
 * java提供了特有的语句进行处理
 * try{
 *   需要检测的代码;
 * }
 * catch(异常类 变量){
 *   处理异常的代码;(处理方式)
 * }
 * finally{
 *   一定会执行的代码;
 * }
 * 3、对捕获到的异常对象进行常见方法操作
 * String getMessage(): 获取异常的信息
 * */

class ExceptionDemo1 {
    int div(int a, int b) {
        return a / b;
    }
}