package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-08 14:18
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
    }
}

class Person {
    // private: 私有，权限修饰符，用于修饰类中的成员（成员变量，成员函数）
    // 私有只在本类中有效
    // 将age私有化后，类以外即使建立了对象也不能直接访问，但是人仍有年龄，就需要在Person类中提供访问类的方式
    // 注意：私有仅仅是封装的一种表现形式
    // 只所对对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句，提高代码的健壮性
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
            speak();
        } else {
            System.out.println("非法age");
        }
    }

    void speak() {
        System.out.println("age=" + age);
    }
}
