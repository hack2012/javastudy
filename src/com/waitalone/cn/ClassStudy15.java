package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 14:23
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy15 {
    public static void main(String[] args) {
        //单例设计模式2
        Single2 s2 = Single2.getInstance();
    }
}

class Single2 {
    private static Single2 s = null;

    private Single2() {
    }
    /*这个是对象被调用时才初始化，也叫做对象延时加载，称之为懒汉式
    * 特点：Single类进内存，对象还没有存在，只有调用了getInstance方法时，才建立对象。
    * 建议单例模式，采用饿汉式，懒汉式需要多重判断
    * */
    public static Single2 getInstance() {
        if (s == null) {
            s = new Single2();
        }
        return s;
    }
}