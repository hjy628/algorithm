package cn.hjy.alogrithm.chap9;

public class MoreThanHalfTest {

    public static void main(String[] args) {
        int[] array1 = {0,1,2,1,2,1,1};

        int[] array2 = {0,2,2,1,2,0,2};
        MoreThanHalf.find1(array1);

        MoreThanHalf.find1(array2);

        int[] array3 = {0,1,2,1,2,1,1};

        int[] array4 = {0,2,2,1,2,0,2};

        MoreThanHalfWithHash.find2(array3);
        MoreThanHalfWithHash.find2(array4);

        MoreThanHalfBatter.find3(array3);
        MoreThanHalfBatter.find3(array4);
    }


}
