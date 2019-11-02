package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-24 14:51
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy23 {
    public static void main(String[] args) {
        SubTime st = new SubTime();
        st.getTime();
    }
}

/*需求：获取一段程序的运行时间
 * 原理：获取程序开始和结束的时间并相减即可。
 * 获取时间：System.currentTimeMillis();
 *
 * 当代码完成优化后，就可以解决这类问题。
 * 这种方式，就是模版方法设计模式。
 *
 * 什么是模版方法呢？
 * 在定义功能时，功能的一部分是确定的，但是有一部分是不确定的，而确定性的部分在使用不确定的部分。
 * 那么 这时就将不确定的部分暴露出去，由该类的子类去完成。
 * */

abstract class GetTime {
    public final void getTime() {
        long start = System.currentTimeMillis();
        // for (int i = 0; i < 1000; i++) {
        //     System.out.print(i);
        // }
        // 中间的这段代码不确定
        runcode();
        long end = System.currentTimeMillis();
        System.out.println("毫秒：" + (end - start));
    }

    public abstract void runcode();
}

class SubTime extends GetTime {
    public void runcode() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}