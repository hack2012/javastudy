package com.waitalone.cn.objects;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-14 15:13
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy9 {
    public static void main(String[] args) {
        /* 主函数的特点：
        主函数是一个特殊的函数，作为程序的入口点，可以被jvm调用。
        public 代表该函数的访问权限是最大的
        static 代表着主函数随着类的加载就已经存在了
        void 主函数没有具体的返回值
        main 不是关键字，但是一个特殊的单词，可以被jvm识别
        函数的参数String[] args 参数类型是一个数组，该数组中的元素是字符串，字符串类型数组
        主函数的格式是固定的(变量名args可以修改)：jvm识别
        jvm在调用主函数时传入的是new String[0];
        */
        for (int x = 0; x < args.length; x++) {
            System.out.println(args[x]);
        }
    }
}
