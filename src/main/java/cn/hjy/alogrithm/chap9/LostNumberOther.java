package cn.hjy.alogrithm.chap9;


import cn.hjy.alogrithm.ch01.HashTable;

/**
 *  寻找缺少的数字
 *  100个连续的数字(eg:1~100)，现在随机打乱顺序，然后随机取出一个数字，那么如何在这个数组中快速找出缺失的数字
 *  具体化问题:有一个长度为99的数组，在这个数组里存储了上面所述的100个数字被拿出1个后的99个数字，现在对数组进行处理以快速找出被拿出的数字
 *
 * 投机取巧法
 * 1~100的数组少了一个数字，所以我们把1~100累加起来，1~100的和(1+100)*100/2=5050,遍历数组，用5050减去数组值的总数，最后剩余的结果就是缺失的数字。
 * 时间复杂度O(n),空间复杂度O(1)
 */
public class LostNumberOther {

    /**
     *  投机取巧法
     * @param  array
      */
    public static void find4(int[] array){
        int all = (1+100)*100/2;
        for (int i = 0; i < array.length; i++) {
            all -= array[i];
        }
        System.out.println("缺失的数字为： "+all);

    }


}
