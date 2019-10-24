package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-15 18:06
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy21 {
    public static void main(String[] args) {
        // 抽象类
        new BaseStudent().study();
        new ChongCiStudent().sleep();
    }
}

/* 当多个类中出现了相同功能，但功能主体不同，这时也可以进行向上抽取。
 * 这时只抽取功能定义，而不抽取功能主体。
 * 抽象：看不懂
 * 抽象类特点：
 * 1、抽象方法一定定义在抽象类中
 * 2、抽象方法和抽象类都必须被abstract关键字修饰
 * 3、抽象类不可以用new创建对象，因为调用抽象方法没意义。
 * 4、抽象类中的方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
 *    如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
 *
 * 抽象类和一般类没有多大的不同。
 * 该如何描述事务，就如何描述事物，只不过该事物出现了一些看不懂的东西。
 * 这些不确定的部分，也是该事物的功能，需要明确出来，但是无法定义主体。
 * 通过抽象方法来表示。
 *
 * 抽象类比一般类多了个抽象函数，在类中可以定义抽象方法。
 * 抽象类不可以实例化。
 *
 * 特殊：抽象类中可以不定义抽象方法，这样做仅仅不让该类建立对象。
 * */

abstract class Students {
    abstract void study();

    void sleep() {
        System.out.println("躺着睡觉");
    }
}

class ChongCiStudent extends Students {
    void study() {
        System.out.println("ChongCi Study");
    }
}

class BaseStudent extends Students {
    void study() {
        System.out.println("Base Study");
    }
}

class AdvStudent extends Students {
    void study() {
        System.out.println("Adv Study");
    }
}