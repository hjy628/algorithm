package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 *
 * 快排的操作是这样的：首先从数列的右边开始往左边找，我们家设这个下标为i,也就是尽享减减操作，找到第一个比基准数小的值
 * 让它与基准值交换;接着从左边开始往右边找，设这个下标为j,然后执行加加操作（j++），找到第一个比基准数大的值，
 * 让他与基准值交换然后继续寻找，直到i与j相遇时结束，最后基准值所在的位置即k的位置，也就是说k左边的值比k上的值小，而k右边的值都比k上的值大
 */
public class QuickSortTest {

    public static void main(String[] args) {
        testQuickSort();
    }

    private static void testQuickSort(){
        int[] array = {1,8,9,3,7,65,41,285,5,8,8,4};
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
        quickSort.print();
    }
}
