package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 * 插入排序
 *
 * 在数列近似有序时，效率会比较高，因为这样会减少比较和移动的次数
 * 时间复杂度是O(n^2) 实现是个双重嵌套循环，外层执行n遍，内层在最坏情况下执行n遍，而且除了比较操作还有移动操作
 * * 最好的情况是数列近似有序，这时一部分内层循环只需要比较及移动较少的次数即可完成排序
 * 空间复杂度为O(1)，是常量级的
 */
public class InsertSort {

    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    public void sort(){
        if (array==null){
            throw new RuntimeException("array is null");
        }
        int length = array.length;
        if (length>0){
            for (int i = 1; i < length; i++) {
                int temp = array[i];
                int j = i;
                for (; j>0 && array[j-1]>temp ; j--) {
                    array[j] = array[j-1];
                }
                array[j] = temp;
            }
        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
