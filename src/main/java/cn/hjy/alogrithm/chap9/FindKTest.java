package cn.hjy.alogrithm.chap9;

import cn.hjy.alogrithm.ch08.RandomArray;
/**
 *  性能分析： 空间复杂度为O(1)
 *  时间复杂度方面，每次进行交换时对快速排序的改进在于快速排序会一直把数组两边的所有元素都排好序，而我们只需要处理一半，而不用都排好，找到k就行了。
 *  假设每次寻找的i都为中间点，那么第1轮排序的时间是n,第2轮排序的时间是n/2,第3轮排序的时间是n/4,一直到找到为止。
 *  所以总的时间为n*(1+1/2+1/2^2+1/2^k),所以时间复杂度为O(n),性能非常好。
 *
 */
public class FindKTest {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,10,12,11,15,14,13};
        RandomArray.random2(array);
        FindK.find(array,0,args.length-1,10);
    }

}
