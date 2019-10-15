package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-14 15:50
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy11 {
    public static void main(String[] args) {
        //静态的应用
        int[] arr = {3, 4, 1, 8};
        int max = getMax(arr);
        System.out.println("max=" + max);
        // ArrayTool tool = new ArrayTool();
        // int min = tool.getMin(arr);
        int min = ArrayTool.getMin(arr);
        System.out.println("min=" + min); 
    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[max]) {
                max = x;
            }
        }
        return arr[max];
    }
}


