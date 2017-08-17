package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-17.
 * 桶排序
 * 时间复杂度为O(n+m) n为待排序的元素的个数，m为桶的个数
 * 对空间消耗太大了
 */
public class BucketSort {

    private int[] buckets;
    private int[] array;

    public BucketSort(int range,int[] array) {
        this.buckets = new int[range];
        this.array = array;
    }

    /**
     *   @Author    排序
     *   @Description
     *   @Date: 下午2:59 17-8-17
     */
    public void sort(){
        if (array != null && array.length>1) {
            for (int i = 0; i < array.length; i++) {
                buckets[array[i]] ++;
            }
        }
    }

    /**
     *   @Author
     *   @Description   从大到小排序
     *   @Date: 下午3:00 17-8-17
     */
    public void print(){
        //倒序输出数据
        for (int i = buckets.length - 1; i >=0; i--) {
            //元素中的值为几，就说明有多少个相同值的元素，就输出几遍
            for (int j = 0; j < buckets[i]; j++) {
                System.out.print(i+",");
            }
        }
    }



}
