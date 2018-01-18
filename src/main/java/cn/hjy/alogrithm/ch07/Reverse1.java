package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-8.
 * 简单反转字符串
 * 时间复杂度为O(n^2)
 */
public class Reverse1 {

    public static String reverse(String str,int start,int end){
        //先转换为字符数组
        char[] array = str.toCharArray();
        //初始化已完成反转第一个字符的位置（默认为待反转外面）
        int finish = end + 1;
        //如果已完成的首字符减到start,则说明反转完成
        while (finish>start){
            char temp = array[start];
            for (int j = start+1; j < finish; j++) {
                array[j-1] = array[j];
            }
            array[finish-1]=temp;
            finish--;
        }
        return String.valueOf(array);
    }



}
