package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 17:42
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy20 {
    public static void main(String[] args) {
        //final关键字
        /*final作为一个修饰符
         * 1、可以修饰类，变量，函数
         * 2、final修饰的类不可以被继承，为了避免被子类复写
         * 3、被final修饰的方法不可以被复写
         * 4、被final修饰的变量是一个常量只能赋值一次，既可以修饰成员变量，也可以修饰局部变量
         * 在描述事物时，一些数据是固定的，为了增强阅读性都给这些值起一个名字，方便阅读；
         * 这个值不需要改变，所以加个final修饰。作为常量，书写格式：所有字母大写，多个单词通过_连接
         * 内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量
         * */
        SubDemo s = new SubDemo();
        s.show2();
    }
}

class FinalDemo {
    //这样x就永远为3了
    final int x = 3;
    final double PI = 3.14;

    final void show1() {
    }

    void show2() {
    }
}

class SubDemo extends FinalDemo {
    // void show1(){}
    void show2() {
        System.out.println(PI);
    }
}