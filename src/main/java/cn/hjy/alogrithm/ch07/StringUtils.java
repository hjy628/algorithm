package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-8.
 */
public class StringUtils {

    /**
     *   @Author
     *   @Description   判断回文字符串 时间复杂度O(n) 空间复杂度O(1)
     *   @Param   * @param str
     *   @Date: 下午3:43 17-11-8
     */
    public static boolean isPalindrome(String str){
        if (str==null||str.length()==0){
            throw new RuntimeException("字符串为空");
        }
        int middle = (str.length()-1)/2;
        for (int i = 0; i < middle; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    /**
     *   @Author
     *   @Description   双重循环，所以时间复杂度是O(n^2) 空间复杂度为O(1) 效率低，可研究下Manacher算法
     *   @Param   str
     *   @Date: 下午4:41 17-11-8
     */
    public static int longestPalindrome(String str){
        if (str==null||str.length()<1){
            return 0;
        }
        int max=0,current=0,length=str.length();

        //循环每个字符为回文的中点
        for (int i = 0; i < length; ++i) {
            //考虑回文子串为奇数长度的情况
            for (int j = 0; i-j>=0&&i+j < length; j++) {
                //如果不相等，则不继续累加回文子串的长度
                if (str.charAt(i-j)!=str.charAt(i+j)){
                    break;
                }
                current = j*2+1;
            }
            //如果得到的长度比max大，则更新max
            if (current>max){
                max = current;
            }
            //重置current(其实这里不充值也不影响后面的结果)
            current = 0;
            //考虑回文子串为偶数长度的情况
            for (int j = 0; (i-j>=0)&&(i+j+1<length); j++) {
                if (str.charAt(i-j)!=str.charAt(i+j+1)){
                    break;
                }
                current = j * 2 +2;
            }
            if (current>max){
                max = current;
            }
        }
        return max;
    }


}
