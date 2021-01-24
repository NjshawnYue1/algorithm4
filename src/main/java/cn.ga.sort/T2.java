package cn.ga.sort;

import java.util.Arrays;

/**
 * @author GuAn
 * @Description 插入排序  直接插入
 * @createTime 2021年01月24日 11:32:00
 * <p>
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class T2 {
    public static void main(String[] args) {
        int[] origin = {9, 3, 2, 3, 5, 7, 4, 2, 1};
        insertSort(origin);
    }

    private static void insertSort(int[] origin) {
        int temp;
        for (int i = 1; i < origin.length; i++) {
            for (int j = i; j > 0; j--) {
                if(origin[i] < origin[j - 1]){
                    temp = origin[i];
                    origin[i] = origin[j];
                    origin[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(origin));
    }
}
