package cn.hjy.alogrithm.chap9;



/**
 * 出现次数超过一半的数字  更优的解法
 *
 *      使用两个变量来保存临时记录，一个变量t用来保存我们想要找的值，初始化为数组中的第1个元素，一个变量n用来保存元素出现的次数，初始化为0.
 *      接下来对数组进行遍历，在当前元素与临时保存的元素值相同时，n加1,表示我们又找到了这个元素；
 *      在当前元素与临时保存的元素值不同时，n减1;当n减到0时，我们重置t的值为新的值。遍历到最后，t一定是我们要找的元素的值。
 *
 *
 *
 *
 */
public class MoreThanHalfBatter {

    /**
     *  O(n)时间复杂度解法
     * @param  array
     */

    public static void find3(int[] array){
        int t = array[0];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==t){
                n++;
            }else {
                n--;
            }
            if (n==0){
                t = array[i];
                n = 1;
            }
        }
        System.out.println("找到了，这个元素为"+t);
    }

}
