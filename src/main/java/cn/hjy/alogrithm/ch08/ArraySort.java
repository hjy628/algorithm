package cn.hjy.alogrithm.ch08;

public class ArraySort {


    /**
     *   @Description 两次遍历填充法
     *   @Param   aray
     *   @Date: 下午3:14 18-5-3
     */
    public static void sort1(int[] array){
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                result[index++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]>=0){
                result[index++] = array[i];
            }
        }

        System.out.print("两次遍历填充法排序后的结果: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i!=result.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }



    /**
     *   @Description 借鉴简单插入排序的思想
     *   @Param   aray
     *   @Date: 下午3:21 18-5-3
     */
    public static void sort2(int[] array){
        int index = 0; //分界index
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                //如果是负数，则依次前移到分解处
                for (int j = i; j > index; j--) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
                //分界指针后移
                index ++;
            }
        }
        System.out.print("借鉴简单插入排序后的结果: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i!=array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    /**
     *   @Description 借鉴快速排序思想
     *   @Param   aray
     *   @Date: 下午3:26 18-5-3
     */
    public static void sort3(int[] array){
        int i = 0;
        int j = array.length-1;

        while (i!=j){
            while (i<j&&array[j]<0){
                i++;
            }
            while (i<j&&array[j]>=0){
                j--;
            }

            if (i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        System.out.print("借鉴简单插入排序后的结果: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]);
            if (k!=array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] array1 = {1,-2,-4,5,9,-3,-8,6};
        int[] array2 = {1,-2,-4,5,9,-3,-8,6};
        int[] array3 = {1,-2,-4,5,9,-3,-8,6};
        sort1(array1);
        sort2(array2);
        sort3(array3);
    }

}
