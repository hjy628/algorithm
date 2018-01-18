package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-8-29.
 * 字符串全排列的递归实现代码
 * 思路：先固定好前面的，然后把后面的进行交换，当全部排完之后把前一位与后面的元素进行交换，继续全排列
 * 在当前变化的几位都排完了之后，再往前新增一位交换位参与到排列中
 */
public class FullPermutation {

    /**
     *   @Author
     *   @Description   字符串全排列的递归实现
     *   @Param   str
     *   @Date: 下午4:58 17-8-29
     */
    public static void recursivePermutation(String str){
        char[] array = str.toCharArray();
        recursivePermutation(array,0,array.length-1);
    }

    /**
     *   @Author
     *   @Description   字符串全排列的递归实现
     *   @Param   array 字符数组
     *   @Param   start 起始下标
     *   @Param   end 结束下标
     *   @Date: 下午4:56 17-8-29
     */
    private static void recursivePermutation(char[] array,int start,int end){
        //当递归到最后一位的时候start与end相等，这是输出排列
        if (start==end){
            for (int i = 0; i < end; i++) {
                System.out.println(array[i]);
            }
            System.out.println();
        }else {
            //一直遍历并递归执行后面部分的全排列
            for (int j = start; j < end; j++) {
                //与当前递归的部分的第1位进行交换
                swap(array,j,start);
                //递归全排列后面的部分
                recursivePermutation(array, start+1, end);
                //交换回去保持原样
                swap(array,j,start);
            }
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


}
