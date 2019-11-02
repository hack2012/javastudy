package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-24 14:35
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy22 {
    public static void main(String[] args) {
        new Pro("zhangsan", "dev01", 100.52).work();
        new Manager("CEO", "ceo01", 1000.52, 10000).work();
    }
}
/*假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性；
 * 姓名、工号以及工资。经理也是员工，除了含有员工的属性外，另外还有一个奖金属性。
 * 请使用继承的思想设计员工类和经理类。要求为中提供必要的方法进行属性访问。
 *
 * 员工类：name,id,pay
 * 经理类：继承了员工类，并有自己特有的奖金属性
 * */

abstract class Employess {
    private String name;
    private String id;
    private double pay;

    Employess(String name, String id, double pay) {
        // 构造函数，初始化
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public abstract void work();
}

class Pro extends Employess {
    Pro(String name, String id, double pay) {
        // 构造函数，初始化
        super(name, id, pay);
    }

    public void work() {
        System.out.println("专业人员干活");
    }
}

class Manager extends Employess {
    private int bonus;

    Manager(String name, String id, double pay, int bonus) {
        // 构造函数，初始化
        super(name, id, pay);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理干活");
    }
}