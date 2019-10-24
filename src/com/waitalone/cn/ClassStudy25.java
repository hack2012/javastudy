package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-24 16:33
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy25 {
    public static void main(String[] args) {
        ZhangSan zs = new ZhangSan();
        zs.study();
        zs.smoke();

    }
}

/*接口的特点：
 * 1、接口是对外暴露的规则。
 * 2、接口是程序的功能扩展。
 * 3、接口可以用来多实现。
 * 4、类与接口之间是实现关系，而且类可以继承一个类的同时实现多个接口。
 * 5、接口与接口之间可以有继承关系。
 * */

abstract class Student1 {
    abstract void study();

    //都睡觉
    void sleep() {
        System.out.println("sleep");
    }

    //都抽烟，不合适，所以使用接口实现
    // void smoke() {
    //     System.out.println("抽烟");
    // }
}

interface Smoking {
    void smoke();
}

class ZhangSan extends Student1 implements Smoking {
    void study() {
        System.out.println("我是学生，我要学习");
    }

    //抽烟实现抽烟接口
    public void smoke() {
        System.out.println("我会抽烟");
    }
}

class LiSi extends Student1 {
    //不抽烟就不需要实现抽烟接口
    void study() {
    }
}