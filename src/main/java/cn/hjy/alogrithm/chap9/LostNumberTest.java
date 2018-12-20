package cn.hjy.alogrithm.chap9;

import cn.hjy.alogrithm.ch08.RandomArray;

public class LostNumberTest {


    public static void main(String[] args) {
        //初始化100个数字
        int[] arrauOld = new int[100];
        for (int i = 0; i < arrauOld.length; i++) {
            arrauOld[i] = i+1;
        }

        //打乱顺序
        RandomArray.random2(arrauOld);

        //只填充前99个数，缺失的数字为100个数中最后一个元素。
        int[] array1 = new int[99];
        int[] array2 = new int[99];
        int[] array3 = new int[99];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = arrauOld[i];
            array2[i] = arrauOld[i];
            array3[i] = arrauOld[i];
        }

        LostNumber.find(array1);
        LostNumber.find2(array2);
        LostNumberWithHash.find3(array3);
        LostNumberOther.find4(array3);


    }


}
