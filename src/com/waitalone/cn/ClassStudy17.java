package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 16:08
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy17 {
    public static void main(String[] args) {
        /*子父类出现后，类成员的特点
         * 类中成员：
         * 1、变量
         * 如果子类中出现非私有的同名成员变量时，子类访问本类变量用this，访问父类中变量用super
         * super和this的使用基本一致，this代表本类对象的引用，super代表父类对象的引用
         * 2、函数
         * 3、构造函数
         * */
        Zi z = new Zi();
        System.out.println(z.num + "...." + z.num);
        z.show();
    }
}

class Fu {
    int num = 4;
}

class Zi extends Fu {
    int num = 5;

    void show() {
        //this代表本类对象的引用，super代表父类对象的引用
        System.out.println("子类的num：" + this.num);
        System.out.println("父类的num：" + super.num);
    }
}