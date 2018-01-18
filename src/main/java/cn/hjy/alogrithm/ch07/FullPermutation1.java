package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-8-29.
 * ASCII码排序全排列
 * 思路：１、从右向左找到第一个位置k,其值比右边的数中的任意一个数小，其实就是在从右向左的升序中第一个被打乱顺序的数
 * ２、找到k右边的序列中最右边的一个比k上的数大的数，位置为y
 * 3、交换k与y上的数
 * ４、把k右边的序列反转
 * 在当前变化的几位都排完了之后，再往前新增一位交换位参与到排列中
 */
public class FullPermutation1 {

    /**
     *   @Author
     *   @Description  ASCII码排序全排列
     *   @Param   str
     *   @Date: 下午4:58 17-8-29
     */
    public static void asciiPermutation(String str){
        //获取字符串每个字符的ascii
        char[] array = str.toCharArray();
        //需要先排序
        shellSort(array);
        int length = array.length;
        int i = 0;
        while (true){
            System.out.println(array);
            //找到数组中第一个被打乱次序的坏人的位置
            for ( i = length-2; (i >=0) && (array[i]>=array[i+1]); --i) {
                ;
            }
            //当i<0时，说明已经遍历到第1个元素的前面了，结束
            if (i<0){
                return;
            }
            int j ;
            //找到排列中第i位的右边最后一个比其大的数的位置j
            for (j = length-1; (j >i) && (array[j] <= array[i]); --j) {
                ;
            }
            //交换i,j的值
            swap(array,i,j);
            //把i位置后面的部分内容反转
            reverse(array,i+1,length-1);
        }
    }



    /**
     *   @Author
     *   @Description   字符数组指定位置的互换
     *   @Param   left
     *   @Param   right
     *   @Param   array
     *   @Date: 下午4:52 17-8-29
     */
    private static void swap(char[] array,int left,int right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    /**
     *   @Author
     *   @Description   字符数组指定区间的反转
     *   @Param   left
     *   @Param   start
     *   @Param   end
     *   @Date: 下午4:52 17-8-29
     */
    private static void reverse(char[] array,int start,int end){
         int mid = (end - start)/2+start;
        for (int i = 0; i < mid - start; i++) {
            swap(array,start+i,end-i);
        }
    }


    /**
     *   @Author
     *   @Description  根据字符ASCII码进行希尔排序
     *   @Param   array
     *   @Date: 下午4:52 17-8-29
     */
    private static void shellSort(char[] array){
        char temp;
        for (int k = array.length/2; k >0; k/=2) {
            for (int i = k; i < array.length; i++) {
                for (int j = i; j >= k; j-=k) {
                    if (array[j-k]>array[j]){
                        temp = array[j-k];
                        array[j-k]=array[j];
                        array[j]=temp;
                    }
                }
            }

        }
    }



}
