package cn.hjy.alogrithm.ch08;

import cn.hjy.alogrithm.ch03.QuickSort;

import java.util.Hashtable;

public class TwoSum {
    
    
    /**
     *   @Description   暴力解法
     *   @Param  array
     *   @Param  sum
     *   @Date: 下午5:15 18-5-2
     */
    public static void find1(int[] array,int sum){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //当不是同一个值并且两个值之和为sum时，输出下标
                if (i!=j && array[i] == sum - array[j]){
                    System.out.println(String.format("i:%d,j:%d",i,j));
                    return;
                }
            }
        }
    }

    /**
     *   @Description   散列表实现
     *   @Param  array
     *   @Param  sum
     *   @Date: 下午5:15 18-5-2
     */
    public static void find2(int[] array,int sum){
        Hashtable hashtable = new Hashtable();
        //首先填充散列表
        for (int i = 0; i < array.length; i++) {
            hashtable.put(array[i],i);
        }

        //依次判断对应值是否存在与散列表中
        for (int i = 0; i < array.length; i++) {
            int index = (int)hashtable.get(sum-array[i]);
            if (index!=-1&&index!=i){
                System.out.println(String.format("i:%d,j:%d",index,i));
                return;
            }
        }
    }

    /**
     *   @Description   排序双数组法
     *   @Param  array
     *   @Param  sum
     *   @Date: 上午10:15 18-5-3
     */
    public static void find3(int[] array,int sum){
        //先快速排序
        QuickSort sort = new QuickSort(array);
        sort.sort();

        //初始化相对数组
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = sum - array[i];
        }

        int i = 0;
        int j = array2.length - 1;
        //i肯定不能大于等于j,不然会导致重复判断
        while (i<j){
            if (array[i]==array2[j]){
                System.out.println(String.format("i:%d,j:%d",i,j));
                return;
            }else if (array[i]<array2[j]){
                while (i<j&&array[i]<array2[j]){
                    i++;
                }
            }else {
                while (i<j&&array[i]>array2[j]){
                    j--;
                }
            }
        }
    }

    /**
     *   @Description   排序单数组法
     *   @Param  array
     *   @Param  sum
     *   @Date: 上午10:45 18-5-3
     */
    public static void find4(int[] array,int sum){
        //先快速排序
        QuickSort sort = new QuickSort(array);
        sort.sort();

        int i = 0;
        int j = array.length - 1;
        while (i<j){
            int sumTemp = array[i]+array[j];
            if (sumTemp==sum){
                System.out.println(String.format("i:%d,j:%d",i,j));
                return;
            }else if (sumTemp<sum){
                    i++;
            }else if (sumTemp>sum) {
                    j--;
            }
        }
    }

    
    
    
    
}
