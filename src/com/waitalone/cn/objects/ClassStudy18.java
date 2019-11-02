package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 16:29
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy18 {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.show1();
        z.show2();
        /*子父类中的函数
        * 当子类中出现和父类一模一样的函数时，子类对象调用该函数，会运行子类函数中的内容，父类函数被覆盖
        * 这类特性叫做重定(覆盖)
        * 当子类继承了父类，沿袭了父类的功能到子类中，但是子类虽具备该功能，但是功能的内容却和父类不一致，
        * 这时没有必要定义新功能，就要使用覆盖特性，保留父类的功能定义，并重定功能内容。
        *
        * 注意事项：
        * 1、子父覆盖父类，必须保证子类权限>=父类权限，否则编译失败。
        * 2、静态只能覆盖静态
        * 记住：
        * 重载：只看同名函数的参数列表
        * 重写：子父类方法要一模一样，包括返回值类型
        * */
        z.show();
        NewTel t = new NewTel();
        t.show();
    }
}

class Fu1 {
    void show1() {
        System.out.println("fu show");
    }
    void show() {
        System.out.println("fu show");
    }
}

class Zi1 extends Fu1 {
    void show2() {
        System.out.println("zi show");
    }

    void show() {
        System.out.println("zi show");
    }
}

class Tel{
    //方法前没有修饰符，代表的是默认权限，默认权限位于public和private之间
    void show(){
        System.out.println("来电号码");
    }
}
class NewTel extends Tel{
    void show(){
        // System.out.println("来电号码");
        super.show();
        System.out.println("来电头像");
        System.out.println("来电名称");
    }
}