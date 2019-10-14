package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-09 11:18
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy8 {
    // 面向对象static关键字
    public static void main(String[] args) {
        PersonDemo3 p = new PersonDemo3();
        p.name = "zhangsan";
        p.show();
        System.out.println("被对象调用：" + p.country);
        System.out.println("被类名调用：" + PersonDemo3.country);
    }
}

class PersonDemo3 {
    String name;  //成员变量,实例变量
    static String country = "CN"; //静态的成员变量，类变量

    /* 静态：static
     * static是一个静态修饰符，用来修饰成员(成员变量，成员方法)
     * 当成员被静态修饰后，就多了一种调用方式，除了被对象调用外，还可以被类名调用。
     * 写法格式 类名.静态成员
     *
     * static 特点：
     * 1、随着类的加载而加载,随着类的消失而消失，说明它的生命周期最长。
     * 2、优先于对象存在，静态是先存在的，对象是后存在的。
     * 3、被所有对象所共享
     * 4、可以直接被类名调用
     *
     * 实例变量和类变量的区别：
     * 1、存放位置 类变量随着类的加载而存在于方法区中，实例变量随着对象的建立而存在于堆内存中
     * 2、生命周期 类变量生命周期最长随着类的消失而消失，实例变量的生命周期随着对象的消失而消失
     *
     * static 的使用注意事项
     * 1、静态方法只能访问静态成员(方法和变量)，非静态方法可以访问静态和非静态
     * 2、静态方法中不可以定义this,super关键字，因为静态优先于对象存在，所以静态方法中不可以出现this
     * 3、主函数是静态的
     *
     * 静态有利有弊
     * 利：对对象的共享数据进行单独空间的存储，节省内存，没有必要每个对象中都存一份，可以直接被类名调用
     * 弊：生命周期过长，访问出现局限性。(静态虽好，只能访问静态)
     * */

    public void show() {
        System.out.println(name + ":" + country);
    }
}