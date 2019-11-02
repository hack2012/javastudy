package com.waitalone.cn.exception;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-11-02 15:33
 * @Blog: https://www.waitalone.cn
 */
public class ExceptionStudy03 {
    public static void main(String[] args) {
        // 对多异常的处理
        ExceptionDemo3 d = new ExceptionDemo3();
        try {
            int x = d.div(4, 1);
            System.out.println("x=" + x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("被零除了");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("角标越界了");
        }
        System.out.println("over");
    }
}

/*对多异常的处理
 * 1、声明异常时，建议声明更为具体的异常，这样处理的可以更具体
 * 2、对方声明几个异常，就对应的有几个catch块，不要定义多余的catch块
 *    如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。
 *
 * 建议在进行catch处理埋，catch中一定要定义具体的处理方式
 * 不要简定义一句 e.printStackTrace(), 也不要简单的就书写一条输出语句。
 * */

class ExceptionDemo3 {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a / b;
    }
}