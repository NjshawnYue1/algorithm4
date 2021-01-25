package cn.ga.sort;

import java.util.Arrays;

/**
 * @author GuAn
 * @Description 希尔排序 分治的插入排序 希尔排序最好时间复杂度和平均时间复杂度都是nlogn，最坏时间复杂度为n²。
 * @createTime 2021年01月25日 11:21:00
 */
public class T3 {

    public static void main(String[] args) {
        int[] origin = {9, 3, 2, 3, 5, 7, 4, 2, 1};
        shellSort(origin);
    }

    public static void shellSort(int[] origin) {
        // 步长  第一次取数组长度的一般
        int section = origin.length / 2;
        int j;
        int temp;
        while (section >= 1) {
            for (int i = section; i < origin.length; i++) {
                // 记录当前元素
                temp = origin[i];
                // 后半部分依据步长匹配前半部分
                j = i - section;
                while (j >= 0 && origin[j] > temp) {
                    // 增量位置对换
                    origin[j + section] = origin[j];
                    j = j - section;
                }
                origin[j + section] = temp;
            }
            section /= 2;
        }
        System.out.print("排序后: " + Arrays.toString(origin));
    }
}
