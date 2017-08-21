package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 */
public class ShellSortTest {

    public static void main(String[] args) {
        testShellSort();
    }


    private static void testShellSort(){
        int[] array = {5,9,1,9,5,6,8,7,3,5,4,1,7,2};
        ShellSort shellSort = new ShellSort(array);
        shellSort.sort();
        shellSort.print();
    }
}
