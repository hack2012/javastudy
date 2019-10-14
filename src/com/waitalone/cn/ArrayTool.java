package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-14 17:25
 * @Blog: https://www.waitalone.cn
 */

/*这是一个数组操作的工具类，可以获取最值
 * @author 张三
 * @version v1.0
 * */
public class ArrayTool {
    /*静态的应用
     * 每一个应用程序中都有共性的功能，可以将这些功能进行抽取，以便于复用。
     * 虽然可以通过建议ArrayTool对象使用这些工具方法，对数组进行操作，但是发现以下问题
     * 1、对象是用于封装的，但是ArrayTool对象并未封装特有数据
     * 2、操作数组的每一个方法都没有用到ArrayTool对象中的特有数据
     *
     * 这时就要考虑，让程序更严谨，是不需要对象的。
     * 可以将ArrayTool中的方法都定义成static的，直接通过类名调用即可。
     *
     * 将方法都静态后，可以方便使用，但是该类还是可以被其它程序建立对象的。
     * 为了更为严谨，强制让该类不能建立对象，可以通过将构造函数私有化完成
     * */
    private ArrayTool() {
        //空参数的构造函数，加上private后可以防止对象调用
    }

    /**
     * 获取一个整型数组中的最大值
     *
     * @param arr 接收一个int类型的数组
     * @return 会返回数组中的最大值
     */
    public static int getMax(int[] arr) {
        int max = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[max]) {
                max = x;
            }
        }
        return arr[max];
    }

    /**
     * 获取一个整型数组中的最小值
     *
     * @param arr 接收一个int类型的数组
     * @return 会返回数组中的最小值
     */
    public static int getMin(int[] arr) {
        int min = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < arr[min]) {
                min = x;
            }
        }
        return arr[min];
    }
}