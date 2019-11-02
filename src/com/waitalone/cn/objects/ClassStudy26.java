package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-24 17:15
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy26 {
    public static void main(String[] args) {
        // Cat c = new Cat();
        // function(c);
        // Dog d = new Dog();
        // function(d);
        // 多态
        // Animal c = new Cat();
        // c.eat();
        function(new Cat());
        function(new Dog());
        // 类型提升。向上转型。
        Animal a = new Cat();
        a.eat();
        // 如果想调用猫的特有方法时，如何操作？
        // 强制性将父类的引用，转成子类类型，向下转型。
        Cat c = (Cat) a;
        c.catchMouse();
        // 千万不要出现这样的操作，就是将父类对象转成子类类型。
        // 我们能转换的是父类应用指向了自己的子类对象时，该应用可以被提升，也可以被强制转换。
    }

    /*public static void function(Cat c) {
        c.eat();
    }

    public static void function(Dog d) {
        d.eat();
    }*/

    public static void function(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.kanJia();
        }
    }


}

/*多态：可以理解为事物存在的多种体现形态。
 * 人：男人，女人
 * 动物：狗，猫
 * 猫 x = new 猫();
 * 动物 x = new 猫();
 * 1、多态的基本体现
 *    父类的引用指向了自己的子类对象，父类的引用也可以接收自己的子类对象
 * 2、多态的前提
 *    必须是类与类之间有关系，要么继承，要么实现。
 *    通常还有一个前提，存在覆盖。
 * 3、多态的好处：大大的提高程序的扩展性
 * 4、多态的弊端：提高了扩展性，但是只能使用父类的引用访问父类中的成员
 * 5、多态的应用
 * */

abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void kanJia() {
        System.out.println("看家");
    }
}