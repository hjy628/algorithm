package cn.hjy.alogrithm.ch04;

import java.util.ArrayList;

/**
 * Created by hjy on 17-8-23.
 * 分块查找
 * 原理：要求把一个数据分为若干块，每一块里面的元素可以是无序的，但是块与块之间的元素是需要有序的，对于一个非递减的数列来说，
 * 第i块中的每个元素一定比第i-1块中的任意元素大，同时，分块查找需要一个索引表，用来限定每一块的范围，在增加、删除、查找元素时都需要用到
 *
 * 特点：拥有顺序查找的二分查找的双重优势，顺序查找不需要有序，二分查找的速度快
 */
public class BlockSearch {

    private int[] index;

    private ArrayList<Integer>[] list;

    /**
     *   @Author
     *   @Description   初始化索引表
     *   @Date: 下午4:41 17-8-23
     */
    public BlockSearch(int[] index) {
        if (index!=null&&index.length!=0){
            this.index = index;
            this.list=new ArrayList[index.length];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList();
            }
        }else {
            throw new Error("index cannot be null or empty.");
        }
    }

    /**
     *   @Author
     *   @Description   插入元素
     *   @Date: 下午4:46 17-8-23
     */
    public void insert(int value){
        int i = binarySearch(value);
        list[i].add(value);
    }

    /**
     *   @Author
     *   @Description   查找元素
     *   @Date: 下午4:48 17-8-23
     */
    public boolean search(int data){
        int i = binarySearch(data);
        for (int j = 0; j < list[i].size(); j++) {
            if (data == list[i].get(j)){
                return true;
            }
        }
        return false;
    }

    /**
     *   @Author
     *   @Description   打印每块元素
     *   @Date: 下午4:49 17-8-23
     */
    public void printAll(){
        for (int i = 0; i < list.length; i++) {
            ArrayList l = list[i];
            System.out.println("ArrayList "+ i + ":");
            for (int j = 0; j < l.size(); j++) {
                System.out.println(l.get(j));
            }
        }
    }

    /**
     *   @Author
     *   @Description   二分查找定位索引位置
     *   @Date: 下午4:45 17-8-23
     */
    private int binarySearch(int data){
        int start = 0 ;
        int end = index.length;
        int mid= -1;
        while (start<=end){
            mid = (start + end)/2;
            if (index[mid]>data){
                end = mid -1;
            }else {
                //如果相等，也插入在后面
                start = mid + 1;
            }
        }
        return start;
    }
}
