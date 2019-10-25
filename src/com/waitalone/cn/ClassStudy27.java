package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-25 16:30
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy27 {
    public static void main(String[] args) {
        // 多态的应用
        // BaseStudent bs = new BaseStudent();
        // bs.study();
        // bs.sleep();
        // AdvStudent as = new AdvStudent();
        // as.study();
        // as.sleep();
        DoStudent ds = new DoStudent();
        ds.doSome(new BaseStudents());
        ds.doSome(new AdvStudents());
    }


    // public void doSome(StudentTest stu) {
    //     stu.study();
    //     stu.sleep();
    // }
}

/*基础班学生：学习，睡觉
 * 高级班学习，学习，睡觉
 *
 * 可以将这两类事物进行抽取
 * */

abstract class StudentTest {
    public abstract void study();

    public void sleep() {
        System.out.println("躺着睡");
    }
}

class BaseStudents extends StudentTest {
    public void study() {
        System.out.println("base study");
    }

    public void sleep() {
        System.out.println("坐着睡");
    }
}

class AdvStudents extends StudentTest {
    public void study() {
        System.out.println("adv study");
    }
}

// 多态应用

class DoStudent {
    public void doSome(StudentTest stu) {
        stu.study();
        stu.sleep();
    }
}