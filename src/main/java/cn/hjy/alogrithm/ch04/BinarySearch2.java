package cn.hjy.alogrithm.ch04;

/**
 * Created by hjy on 17-8-22.
 * 二分查找的非递归实现
 */
public class BinarySearch2 {

    private int[] array;

    public BinarySearch2(int[] array) {
        this.array = array;
    }

    /**
     *   @Author
     *   @Description   二分查找（非递归）
     *   @Date: 上午10:36 17-8-22
     */
    public int search(int target){
        if (array==null){
            return -1;
        }

        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (array[mid] == target){
                return mid;
            }else if (target < array[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
