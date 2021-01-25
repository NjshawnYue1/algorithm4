package cn.ga.sort;

import java.util.Arrays;

/**
 * @author GuAn
 * @Description 冒泡排序
 * @createTime 2021年01月25日 12:11:00
 */
public class T4 {
    public static void main(String[] args) {
        int[] origin = {9, 3, 2, 3, 5, 7, 4, 2, 1};
        bubbleSort(origin);
    }

    private static void bubbleSort(int[] origin) {
        int temp;
        for (int i = 1; i < origin.length; i++) {
            for (int j = i; j > 0; j--) {
                if (origin[j] < origin[j - 1]) {
                    temp = origin[j];
                    origin[j] = origin[j - 1];
                    origin[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(origin));
    }


}
