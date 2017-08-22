package cn.hjy.alogrithm.ch04;

/**
 * Created by hjy on 17-8-22.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,7,9,11,15,19};
        BinarySearch binarySearch = new BinarySearch(array);
        System.out.println(binarySearch.searchRecursion(0));
        System.out.println(binarySearch.searchRecursion(11));
        BinarySearch2 binarySearch2 = new BinarySearch2(array);
        System.out.println(binarySearch2.search(0));
        System.out.println(binarySearch2.search(11));
    }


}
