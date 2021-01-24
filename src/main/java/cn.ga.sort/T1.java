package cn.ga.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author GuAn
 * @Description 排序1 选择排序
 * @createTime 2021年01月23日 14:58:00
 * 选择排序
 * 首先，找到数组中最小的那个元素，
 * 其次，将它和数组的第 一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
 * 再次，在剩下的元素中 找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序
 *
 * 无论需要排序的数组是否有序 都会被全部比较一遍 时间复杂度为n²
 */


public class T1 {

    public static void main(String[] args) {
        int[] origin = {9, 3, 2, 3, 5, 7, 4, 2, 1};
        selectSort(origin);
    }

    private static void selectSort(int[] origin) {
        int temp;
        for (int i = 0; i < origin.length; i++) {
            for (int j = i + 1; j < origin.length; j++) {
                if(origin[i] > origin[j]){
                    temp = origin[i];
                    origin[i] = origin[j];
                    origin[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(origin));
    }
}
