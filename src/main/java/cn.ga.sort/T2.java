package cn.ga.sort;

import java.util.Arrays;

/**
 * @author GuAn
 * @Description 插入排序  直接插入 适用于数据量比较小的情况
 * @createTime 2021年01月24日 11:32:00
 * <p>
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 * <p>
 * <p>
 * 工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 */
public class T2 {
    public static void main(String[] args) {
        int[] origin = {9, 3, 2, 3, 5, 7, 4, 2, 1};
        insertSort(origin);
    }

    private static void insertSort(int[] origin) {
        // 要插入的数据 current
        int i, j, current;
        if (origin.length == 1) return;
        // 从数组的第二个元素开始循环将数组中的元素插入
        for (i = 1; i < origin.length; i++) {
            // 设置数组中的第2个元素为第一次循环要插入的数据
            current = origin[i];
            // 有两个限制条件 可以确保小的在前面 如果current < origin[j]不成立 则说明当前记录的元素已经找到了合适的位置插入
            for (j = i - 1; j >= 0 && current < origin[j]; j--) {
                // 如果满足条件只做后移 第一次后移就覆盖掉了j+1也就是当前的i但是没关系 current记录了当前的origin[i]
                // 移动的范围是从0到i 不是数组中的所有元素都要后移
                origin[j + 1] = origin[j];
            }
            // 直到要插入的元素不小于第j个元素,插入到该元素的后面
            origin[j + 1] = current;
        }
        System.out.println(Arrays.toString(origin));
    }
}
