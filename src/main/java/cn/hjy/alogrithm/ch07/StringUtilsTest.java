package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-8.
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        System.out.println(StringUtils.isPalindrome("abcba"));
        System.out.println(StringUtils.isPalindrome("abccba"));
        System.out.println(StringUtils.isPalindrome("abdbd"));
        System.out.println(StringUtils.longestPalindrome("abdefgfedcgcda"));
    }
}
