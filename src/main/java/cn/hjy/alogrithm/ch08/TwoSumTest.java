package cn.hjy.alogrithm.ch08;

public class TwoSumTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,6,8,23,176,10,8,46,7,13,17,16,18};
        int num = 20;
        TwoSum.find1(arr,num);
       // TwoSum.find2(arr,num);
        TwoSum.find3(arr,num);
        TwoSum.find4(arr,num);
    }


}
