package cn.hjy.alogrithm.ch04;

/**
 * Created by hjy on 17-8-22.
 * 二分查找(Binary Search)也叫做折半查找，有两个要求：一个是数列有序，另一个是数列使用顺序存储结构（比如数组）
 * 原理：首先要有一个有序的列表，如果没有可用排序算法进行排序
 * 以升序数列为例，比较一个元素与数列中的中间位置的元素的大小，如果比中间位置的元素大，则继续在后半部分的数列中进行二分查找，若小，则在数列的前半部分进行比较，
 * 如果相等，则找到了元素的位置，每次比较的数列长度都会是之前数列的一半，直到找到相等元素的位置或者最终没有找到要找的元素
 *
 * 插值查找：要查找的位置P=low + (key -a[low])/(a[high]-a[low])*(high-low)
 *
 * 二分查找的ASL为((n+1)log2(n+1))/n-1
 */
public class BinarySearch {

    private int[] array;

    /**
     *   @Author
     *   @Description   初始化数组
     *   @Date: 上午10:31 17-8-22
     */
    public BinarySearch(int[] array) {
        this.array = array;
    }


    /**
     *   @Author
     *   @Description   递归实现二分查找
     *   @Date: 上午10:32 17-8-22
     */
    public int searchRecursion(int target){
        if (array!=null){
            return searchRecursion(target,0,array.length-1);
        }
        return -1;
    }

    private int searchRecursion(int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid = start + (end - start) /2;
        if (array[mid] == target){
            return mid;
        }else if (target < array[mid]){
            return searchRecursion(target,start,mid - 1);
        }else {
            return searchRecursion(target,mid+1,end);
        }
    }
}
