package cn.hjy.alogrithm.chap9;

import cn.hjy.alogrithm.ch03.QuickSort;

/**
 *  寻找缺少的数字
 *  100个连续的数字(eg:1~100)，现在随机打乱顺序，然后随机取出一个数字，那么如何在这个数组中快速找出缺失的数字
 *  具体化问题:有一个长度为99的数组，在这个数组里存储了上面所述的100个数字被拿出1个后的99个数字，现在对数组进行处理以快速找出被拿出的数字
 *
 *  排序解法，先对数组进行快速排序，之后对数组进行一次遍历，在正常情况下数组的值应该是加1递增的，如果我们发现两个元素之间间隔2了
 *  ，那么我们要找的元素就一定是这两个元素中间的那个元素的值了
 */
public class LostNumber {

    /**
     *  借助快速排序实现
     * @param  array
     * 有问题，如果缺失的元素刚好是最小的元素1或者最大的元素100，那么就无法找到了。
     */
    public static void find(int[] array){
        QuickSort sort = new QuickSort(array);
        sort.sort();
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i-1] != 1){
                System.out.println("缺失的数字为： "+(array[i]-1));
                return;
            }
        }
    }


    /**
     *  借助快速排序实现
     * @param  array
     *  判断array[i]是否等于i+1,如果等于是正常的，否则第一个找到的位置i+1就是缺失的元素了。
     */
    public static void find2(int[] array){
        QuickSort sort = new QuickSort(array);
        sort.sort();
        for (int i = 1; i < array.length; i++) {
            if (array[i] != i+1){
                System.out.println("缺失的数字为： "+(array[i]-1));
                return;
            }
        }
    }



}
