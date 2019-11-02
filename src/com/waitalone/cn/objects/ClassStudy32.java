package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-26 14:28
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy32 {
    public static void main(String[] args) {
        new Outer2().method();
    }
}

/*内部类定义在局部变量时：
* 1、不可以被成员修饰符修饰
* 2、可以直接访问外部类中的成员，因为还持有外部类中的引用。
*    但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量
* */

class Outer2 {
    int x = 3;

    void method() {
        final int y = 4;
        class Inner2 {
            void function() {
                System.out.println(Outer2.this.x);
                System.out.println(y);
            }
        }
        new Inner2().function();
    }
}