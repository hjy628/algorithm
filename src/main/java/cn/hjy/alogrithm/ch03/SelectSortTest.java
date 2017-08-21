package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 */
public class SelectSortTest {

    public static void main(String[] args) {
        testSelectSort();
    }


    private static void testSelectSort(){
        int[] array = {5,9,1,9,5,6,8,7,3,5,4,1,7,2};
        SelectSort selectSort = new SelectSort(array);
        selectSort.sort();
        selectSort.print();
    }

}
