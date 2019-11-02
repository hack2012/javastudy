package com.waitalone.cn.exception;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-11-02 16:17
 * @Blog: https://www.waitalone.cn
 */
public class ExceptionStudy04 {
    public static void main(String[] args) {
        ExceptionDemo4 d = new ExceptionDemo4();
        try {
            int x = d.div(4, -1);
            System.out.println("x=" + x);
        } catch (FuShuException e) {
            System.out.println(e.toString());
            System.out.println("除数出现了负数");
            System.out.println("错误的负数是：" + e.getValue());
        }
    }
}

/*因为项目中会出现特有的问题
 * 而这些问题并未被java所描述并封装对象
 * 所以对于这些特有的问题可以按照java的对问题封装的思想将特有的问题进行自定义异常封装
 *
 * 自定义异常
 * 需求：在本程序中，对于除数是-1，也视为是错误的是无法进行运算的。
 * 那么就需要对这个问题进行自定义的描述。
 * 当在函数内部出现了throw抛出异常对象，那么就必须要给出对应的处理动作。
 * 那么在内部try catch处理，要么在函数上声明让调用者处理。
 * 一般情况下函数函数内出现异常，函数上需要声明。
 *
 * 发现打印的结果中只有异常的名称，却没有异常的信息，因为自定义的异常并未定义信息。
 * 如何定义异常信息？
 * 因为父类已经把异常信息的操作都完成了，所以子类只要在构造时，将异常信息传递给父类，通过super语句；
 * 那么就可以直接通过geMessage方法获取自定义的异常信息了。
 *
 * 自定义异常，必须是自定义类继承Exception，原因如下：
 * 异常体系有一个特点：因为异常类和异常都都被抛出，他们都具备可抛性，这个可抛性是Throwable这个体系中的独有特点
 * 只有这个体系中的类和对象才可以被throws和throw操作
 *
 * throws和throw的区别
 * throws使用在函数上
 * throw使用在函数内
 * throws后面跟的是异常类，可以跟多个，用逗号隔开。
 * throw后跟的是异常对象
 * */

class FuShuException extends Exception {
    // private String msg;
    //
    // FuShuException(String msg) {
    //     this.msg = msg;
    // }
    //
    // public String getMessage() {
    //     return msg;
    // }
    private int value;

    FuShuException() {
        super();
    }

    FuShuException(String msg, int value) {
        super(msg);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class ExceptionDemo4 {
    int div(int a, int b) throws FuShuException {
        if (b < 0) {
            // 手动通过throw关键字抛出一个自定义异常
            throw new FuShuException("出现了负数", b);
        }
        return a / b;
    }
}