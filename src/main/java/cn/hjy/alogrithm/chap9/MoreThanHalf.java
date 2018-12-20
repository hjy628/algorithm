package cn.hjy.alogrithm.chap9;

import cn.hjy.alogrithm.ch03.QuickSort;

/**
 * 出现次数超过一半的数字
 *
 *  有个可优化的地方，对数组进行排序后并不需要再遍历一次来统计每个元素出现的次数，因为要找的那个元素一定就是数组正中间的那个元素
 *  如果要找的这个数是数组中最小的元素，那么排序后一定开始于下标0,终止于下表length/2之后，也就是中间点之后；
 *  相对地如果要找的数是数组中最大的元素，那么排序后一定开始于length/2之前，终止于数组length-1的位置；
 *  如果在中间，则不管怎么移动，正中间的那个元素一定是我们要找的那个值，所以我们在排序之后只需要直接输出array[length/2]这个值就好了
 */

public class MoreThanHalf {

    /**
     *  排序解法
     *  @param  array
     */

    public static void find1(int[] array){
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
        //初始化为1，因为下面要忽略第1个元素并开始累加
        int count = 1;

        //这里下标为1的元素开始
        for (int i = 1; i < array.length; i++) {
            //如果不相同，则需要进行判断
            if (array[i]!=array[i-1]){
                //如果大于一半的次数
                if (count> array.length / 2){
                    System.out.println("找到了，这个元素为"+array[i-1]);
                    return;
                }else {
                    //重置为1,因为要把自己这次加上
                    count = 1;
                }
            }else {
                //如果相同，则需要累加
                count++;
            }
        }

        if (count>array.length /2){
            //如果遍历到最后都是相同的，并且大于一半
            //说明最后的元素就是要找的元素
            System.out.println("找到了，这个元素为"+array[array.length-1]);
        }else {
            //说明这个数组中就没有元素出现的次数超过一半
            System.out.println("没有找到");
        }
    }
}
