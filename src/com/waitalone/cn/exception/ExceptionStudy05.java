package com.waitalone.cn.exception;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-11-02 16:45
 * @Blog: https://www.waitalone.cn
 */
public class ExceptionStudy05 {
    public static void main(String[] args) {
        ExceptionDemo5 d = new ExceptionDemo5();
        int x = d.div(4, -1);
        System.out.println("x=" + x);
        System.out.println("over");
    }
}

/* Exception中有一个特殊的子类异常叫RuntimeException 运行时异常
 * 如果在函数内抛出该异常，函数上可以不用声明，编译一样通过。
 * 如果在函数上声明了该异常，调用者可以不用进行处理，编译一样通过。
 * 之所以不用在函数上声明，是因为不需要让调用者处理。
 * 当该异常发生，希望程序停止，因为在运行时出现了无法继续运算的情况，希望停止程序对代码进行修正。
 *
 * 自定义异常时，如果该异常的发生无法再继续进行运算，就让自定义的异常继承RuntimeExcetion
 *
 * 对于异常分两种：
 * 1、编译时被检测的异常
 * 2、编译时不被检测的异常（运行时异常，RuntimeException及其子类）
 * */


class FuShuException2 extends RuntimeException {
    FuShuException2(String msg) {
        super(msg);
    }
}

class ExceptionDemo5 {
    int div(int a, int b) { // throws ArithmeticException
        if(b<0){
            throw new FuShuException2("出现除数为负数了");
        }
        if (b == 0) {
            throw new ArithmeticException("被0除啦");
        }
        return a / b;
    }
}