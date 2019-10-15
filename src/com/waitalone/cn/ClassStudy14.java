package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 11:45
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy14 {
    public static void main(String[] args) {
        //设计模式：解决某一类问题最行之有效的方法
        /*java中有23中设计模式
         * 单例设计模式：解决一个类在内存中只存在一个对象
         * 想要保证对象唯一：
         * 1、为了保证其它程序过多的建立该类对象，先禁止其它程序建立该对象
         * 2、为了让其它程序访问到该类对象，只好在本类中自定义一个对象
         * 3、为了方便其它程序对自定义对象的访问，可以对外提供一些访问方式。
         * 这三步如何实现？
         * 1、将构造函数私有化
         * 2、在本类中创建一个本类对象
         * 3、提供一个方法可以获取到本对象
         *
         * 对于事物该怎么描述，还怎么描述，当需要将该事物的对象在内存中保持唯一时，就将以上3步加上即可。
         * */
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        s1.setNum(10);
        // System.out.println(s1.getNum());
        System.out.println(s2.getNum());
    }
}

class Single {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    private Single() {
    }

    private static Single s = new Single();

    public static Single getInstance() {
        return s;
    }
}
