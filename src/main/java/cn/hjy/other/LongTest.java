package cn.hjy.other;

/**
 * Created by hjy on 18-5-6.
 */
public class LongTest {
    public static void main(String[] args) {
        System.out.println(2048/3);
        long a = 0xf000000000000000L;
        long b = 0x7FFFFFFFFFFFFFF1L;
        System.out.println(Long.toBinaryString(a)+"长度为:"+Long.toBinaryString(a).length());
        System.out.println(Long.toBinaryString(b)+"长度为:"+Long.toBinaryString(b).length());
        System.out.println(Long.toBinaryString(a-b)+"长度为:"+Long.toBinaryString(a-b).length());
    }
}
