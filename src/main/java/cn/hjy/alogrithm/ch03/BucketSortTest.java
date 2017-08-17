package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-17.
 */
public class BucketSortTest {

    public static void main(String[] args) {
        testBucketSort();
    }

    /**
     *   @Author
     *   @Description 桶排序
     *   @Date: 下午3:03 17-8-17
     */
    private static void testBucketSort(){
        int[] array = {5,9,1,9,5,3,7,6,1,5,8,4,6,7,3};
        BucketSort bucketSort = new BucketSort(11,array);
        bucketSort.sort();
        bucketSort.print();
    }
}
