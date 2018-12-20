package cn.hjy.alogrithm.chap9;


/**
 *  找出数组中第k大的数
 *   假设k非常小，则我们可以采用寻找k遍最大的数的方式来做，时间复杂度为O(kn),如果k很小，比如为5\10，则其实效率很高。
 *   只需要找出第k大的数，并不需要找出最大的k个数，所以可以借助快速排序的思想来处理这个问题。
 *   实现原理： 首先找出一个基准数，就和快速排序一样，接着把小于基准数的元素移动到数组右边，把大于基准数的元素移动到数组左边。
 *   在一趟排序结束后，这个基准数的下标肯定就在其应该在的位置上了，也就是第i+1大的数，所以只需要判断当前位置与k的大小就好了。
 *   如果i+1等于k,则说明我们找到这个数了；如果i+1小于k,则说明我们要找的k在正在排序额数组的左半部分；
 *   如果i+1大于k，则说明我们要找的k在正在排序的数组的右半部分。
 *   在第1轮排序结束后，我们根据排序得出的结论，在数组的左边或者右边继续进行这样的移动，知道i+1等于k为止。
 *
 */

public class FindK {

    public static void find(int[] array,int begin,int end,int k){
        int i = partition(array, begin, end);
        if (i+1>k){
            //右半部分
            find(array, begin,i-1, k);
        }else if (i+1<k){
            find(array, i+1, end, k);
        }else {
            System.out.println("找到了： "+array[i]);
            return;
        }
    }

    /**
     *  每轮快速排序
     * @param  array
     * @param  begin
     * @param  end
     * @return
     */
    private static int partition(int[] array,int begin,int end){
        if (begin<end){
            int key = array[begin];
            while (begin<end){
                while (begin<end && array[end]>key){
                    end--;
                }
                if (begin<end){
                    array[begin] = array[end];
                    begin++;
                }
                while (begin<end && array[begin] < key){
                    begin++;
                }
                if (begin>end){
                    array[end] = array[begin];
                    end--;
                }
            }
            array[begin] = key;
        }
        return begin;
    }


}
