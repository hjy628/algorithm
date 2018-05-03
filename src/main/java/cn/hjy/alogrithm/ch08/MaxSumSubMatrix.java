package cn.hjy.alogrithm.ch08;

public class MaxSumSubMatrix {



    /**
     *   @Description   获取矩阵的最大和子矩阵
     *   @Param   matrix
     *   @Date: 下午2:27 18-5-3
     */
    public static int maxSumSubMatrix(int[][] matrix){
        int[][] total = matrix;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                total[i][j] +=total[i-1][j];
            }
        }
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                //result 保存的是从第i行到第j行所对应的矩阵的所有元素值的和
                int[] result = new int[matrix[0].length];
                for (int l = 0; l < matrix[0].length; l++) {
                    if (i==0){
                        result[l] = total[j][l];
                    }else {
                        result[l] = total[j][l] - total[i-1][l];
                    }
                }
                int maximal = maxSubArray(result);

                if (maximal > maximum){
                    maximum = maximal;
                }

            }
        }
        return maximum;
    }


    /**
     *   @Description   动态规划法
     *   @Param   array
     *   @Date: 下午2:04 18-5-3
     */
    public static int maxSubArray(int[] array){
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
       return maxsum;
    }


}
