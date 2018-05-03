package cn.hjy.alogrithm.ch08;

public class MaxSumSubArray {

    /**
     *   @Description   暴力穷举法
     *   @Param   array
     *   @Date: 上午11:04 18-5-3
     */
    public static void find1(int[] array){
            int maxsum = array[0];
            int currentSum = 0;
            int start = 0;
            int end = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    currentSum +=array[k];
                }
                //如果本次的和大于之前累加的最大和，就重新赋值
                if (currentSum>maxsum){
                    maxsum = currentSum;
                    start = i;
                    end = j;
                }
                currentSum = 0; //这里在每次计算后需要初始化当前的和
            }
        }
        System.out.println("连加值最大的和为"+maxsum);
        System.out.print("连加值最大的子数组为: ");
        for (int i = start; i < end; i++) {
            System.out.print(array[i]);
            if (i!=end){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    /**
     *   @Description   暴力穷举法
     *   @Param   array
     *   @Date: 上午11:04 18-5-3
     */
    public static void find2(int[] array){
            int maxsum = array[0];
            int currentSum = 0;
            int start = 0;
            int end = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                    currentSum +=array[j];
                //如果本次的和大于之前累加的最大和，就重新赋值
                if (currentSum>maxsum){
                    maxsum = currentSum;
                    start = i;
                    end = j;
                }
            }
            currentSum = 0; //这里在每次计算后需要初始化当前的和
        }
        System.out.println("连加值最大的和为"+maxsum);
        System.out.print("连加值最大的子数组为: ");
        for (int i = start; i < end; i++) {
            System.out.print(array[i]);
            if (i!=end){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    /**
     *   @Description   动态规划法
     *   @Param   array
     *   @Date: 下午2:04 18-5-3
     */
    public static void find3(int[] array){
            int lastSum = 0;
            int maxsum = array[0];
            int start = 0;
            int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (lastSum > 0) {
                //累加
                lastSum = lastSum + array[i];
            }else {
                //如果需要新的起点，则重新赋值start
                lastSum = array[i];
                start = i;
            }

            if (maxsum<lastSum){
                //有新的最大的和了
                maxsum = lastSum;
                end = i;
            }
        }
        System.out.println("连加值最大的和为"+maxsum);
        System.out.print("连加值最大的子数组为: ");
        for (int i = start; i < end; i++) {
            System.out.print(array[i]);
            if (i!=end){
                System.out.print(",");
            }
        }
        System.out.println();
    }





}
