package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-8.
 * 对换反转法（把字符串需要反转的部分对折一下，然后将相应的位置进行交换就好了）
 * 时间复杂度为O(n)
 */
public class Reverse2 {

    /**
     *   @Author
     *   @Description   在对换位置反转字符
     *   @Param  str
     *   @Param  start
     *   @Param  end
     *   @Date: 下午2:56 17-11-8
     */
    public static String reverse2(String str,int start,int end){
        char[] array = str.toCharArray();
        int mid = (end-start)/2 + start;
        for (int i = 0; i < mid - start; i++) {
            swap(array,start+i,end-i);
        }
        return String.valueOf(array);
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
     *   @Description 字符串旋转 时间复杂度为O(n)
     *   @Param     str
     *   @Param     index
     *   @Date: 下午3:07 17-11-8
     */
    public static String rotate(String str,int index){
        str = reverse2(str,0,index);
        str = reverse2(str,index+1,str.length()-1);
        str = reverse2(str,0,str.length()-1);
        return str;
    }

}
