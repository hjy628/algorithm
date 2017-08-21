package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 * 希尔排序
 * 基本思想: 把待排序的数列按照一定的增量分割成多个子数列。但是这个子数列不是连续的，而是通过前面提到的增量，按照一定相隔的增量进行分割的
 * 然后对各个子数列进行插入排序，接着增量逐渐减小，然后仍然对每部分进行插入排序，在减小到1之后直接使用插入排序处理数列
 * 这里选择增量的要求是每次都要减少，直到最后一次变为1为止
 *
 *
 *
 * 希尔排序的特点及性能
 * 只使用了一种增量的方式去改进插入排序，实际上希尔排序在内部还是使用插入排序进行处理的，但是这个增量确实有它的意义
 * 不管数列有多长，刚开始时增量会很大，所以每一租待排序的数列的规模会很小，排序会很快
 * 尽管后来数列的规模慢慢变大，但是数列整体已经开始趋于有序了，所以插入排序的速度还是越来越快的
 *
 * 增量可推荐的序列：
 * N/3+1,N/3^2+1,N/3^3+1......(据说在序列数N<100000时最优);
 * 2^k-1,2^(k-2)-1......(设k为总趟数)
 * 其他的如质数法等
 * 每次除以2的增量选择，最好时间o(n),最坏时间o(n^2)
 *
 *
 */
public class ShellSort {

    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    public void sort(){
        int temp;
        for (int k = array.length/2; k > 0 ; k/=2) {
            for (int i = k; i < array.length; i++) {
                for (int j = i; j >= k ; j-=k) {
                    if (array[j-k] > array[j]){
                        temp = array[j-k];
                        array[j-k] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
