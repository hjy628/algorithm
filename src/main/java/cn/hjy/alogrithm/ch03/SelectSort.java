package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 * 简单选择排序
 * 在序列中依次选择最大（或者最小）的数，并将其放到待排序的数列的起始位置
 *
 */
public class SelectSort {

    private int[] array;

    public SelectSort(int[] array) {
        this.array = array;
    }

    public void sort(){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;

            for (int j =i+1; j < array.length; j++) {
                if (array[j] <array[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex!=i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }

        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
