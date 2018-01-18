package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-8.
 */
public class StringUtils3Test {
    public static void main(String[] args) {
        System.out.println(StringUtils3.toInt("-12345"));
        System.out.println(StringUtils3.toInt("12345"));

        System.out.println(StringUtils3.toInt("-1234567890"));
        System.out.println(StringUtils3.toInt("-2147483648"));

        System.out.println(StringUtils3.toInt("1234567890"));
        System.out.println(StringUtils3.toInt("2147483647"));

        System.out.println(StringUtils3.toInt("2157483647"));
        System.out.println(StringUtils3.toInt("-2127484648"));
    }
}
