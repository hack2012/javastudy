package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-26 10:30
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy29 {
    public static void main(String[] args) {
        // 多态的应用
        /*MainBoard mb = new MainBoard();
        mb.run();
        mb.useNetCard(new NetCard());*/
        MainBoard mb = new MainBoard();
        mb.run();
        mb.usePCI(null);
        mb.usePCI(new NetCard());
        mb.usePCI(new SoundCard());
    }
}

/* 需求：电脑运行实例
 * 电脑运行基于主板
 * */

/*
class MainBoard {
    public void run() {
        System.out.println("mainboard run");
    }

    public void useNetCard(NetCard n) {
        n.open();
        n.close();
    }
}

class NetCard {
    public void open() {
        System.out.println("netcard open");
    }

    public void close() {
        System.out.println("netcard close");
    }
}*/

interface PCI {
    public void open();

    public void close();
}

class MainBoard {
    public void run() {
        System.out.println("mainboard run");
    }

    public void usePCI(PCI p) {
        // PCI p = new NetCard(); 接口型引用指向自己的子类对象
        if (p != null) {
            p.open();
            p.close();
        }
    }
}

class NetCard implements PCI {
    public void open() {
        System.out.println("netcard open");
    }

    public void close() {
        System.out.println("netcard close");
    }
}

class SoundCard implements PCI {
    public void open() {
        System.out.println("soundcard open");
    }

    public void close() {
        System.out.println("soundcard close");
    }
}