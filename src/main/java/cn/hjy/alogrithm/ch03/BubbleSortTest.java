package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-17.
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        testBubbleSort();
    }

    private static void testBubbleSort(){
        int[] array = {5,9,1,9,5,3,7,6,1,5,8,4,6,7,3};
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort2();
        bubbleSort.print();
    }
}
