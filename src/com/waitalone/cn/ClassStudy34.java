package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-26 17:48
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy34 {
    public static void main(String[] args) {
        // 匿名内部类，补足代码，使下面的语句正常。
        // TestDemo.function():Test类中有一个静态的方法function
        // .method():function这个方法运算后的结果是一个对象，而且是一个InterDemo类型的对象。
        // 因为只有是InterDemo类型的对象，才可以调用method方法
        TestDemo.function().method();
        // show(new InterDemo() {
        //     @Override
        //     public void method() {
        //         System.out.println("method show run");
        //     }
        // });
    }

    // public static void show(InterDemo in) {
    //     in.method();
    // }
}

interface InterDemo {
    void method();
}

class TestDemo {
    // 补足代码，通过匿名内部类
    // static class Inner implements InterDemo{
    //     public void method(){
    //         System.out.println("method run");
    //     }
    // }
    static InterDemo function() {
        // return new Inner();
        return new InterDemo() {
            @Override
            public void method() {
                System.out.println("method run");
            }
        };
    }
}