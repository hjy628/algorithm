package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-16.
 */
public class StringContainsUtilTest {

    public static void main(String[] args) {
        String str1 = "ABCDEFG", str2 = "BDBG", str3="BDBQ";
        System.out.println(StringContainsUtil.contains(str1,str2));
        System.out.println(StringContainsUtil.contains(str3,str1));
        System.out.println(StringContainsUtil.contains2(str1,str2));
        System.out.println(StringContainsUtil.contains2(str1,str3));
        System.out.println(StringContainsUtil.contains3(str1,str2));
        System.out.println(StringContainsUtil.contains3(str1,str3));
        System.out.println(StringContainsUtil.contains4(str1,str2));
        System.out.println(StringContainsUtil.contains4(str1,str3));
        System.out.println(StringContainsUtil.contains5(str1,str2));
        System.out.println(StringContainsUtil.contains5(str1,str3));
    }

}
