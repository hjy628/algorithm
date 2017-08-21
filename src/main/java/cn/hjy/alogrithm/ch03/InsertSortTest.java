package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-21.
 */
public class InsertSortTest {

    public static void main(String[] args) {
        testInsertSort();
    }

    /**
     *   @Author
     *   @Description   插入排序
     *   @Date: 下午3:11 17-8-21
     */
    private static void testInsertSort(){
        int[] array = {1,34,6,7,34,8,6,8,0,3,9};
        InsertSort insertSort = new InsertSort(array);
        insertSort.sort();
        insertSort.print();
    }
}
