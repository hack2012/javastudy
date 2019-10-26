package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-26 14:51
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy33 {
    public static void main(String[] args) {
        // 匿名内部类
        new Outer3().function();
    }
}

/*匿名内部类
 * 1、匿名内部类其实就是内部类的简写格式
 * 2、定义匿名内部类的前提：
 *    内部类必须是继承一个类或者实现接口。
 * 3、匿名内部类的格式：new 父类或者接口(){定义子类的内容}
 * 4、其实匿名内部类就是一个匿名子类对象，而且这个对象有点胖，可以理解为带内容的对象。
 * 5、匿名内部类中定义的方法最好不要超过3个
 * */

abstract class AbsDemo {
    abstract void show();
}


class Outer3 {
    int x = 3;

    // class Inner3 extends AbsDemo {
    //     void show() {
    //         System.out.println("show:" + x);
    //     }
    // }

    public void function() {
        // new Inner3().show();
        new AbsDemo() {
            void show() {
                System.out.println("x:" + x);
            }
            void abc(){
                System.out.println("abc");
            }
        }.show();
        // AbsDemo d = new AbsDemo() {
        //     @Override
        //     void show() {
        //         System.out.println("x====="+x);
        //     }
        // };
        // d.show();
    }
}