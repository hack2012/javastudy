package com.waitalone.cn.exception;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-11-02 14:30
 * @Blog: https://www.waitalone.cn
 */
public class ExceptionStudy02 {
    public static void main(String[] args) { //throws Exception
        ExceptionDemo2 d = new ExceptionDemo2();
        try {
            int x = d.div(4, 0);
            System.out.println("x=" + x);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("ove");
    }
}

/**/

class ExceptionDemo2 {
    int div(int a, int b) throws Exception {
        // 在功能上通过throws的关键字声明了该功能有可能会出现问题
        return a / b;
    }
}