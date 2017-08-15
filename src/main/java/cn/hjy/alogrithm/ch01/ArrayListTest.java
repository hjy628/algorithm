package cn.hjy.alogrithm.ch01;

/**
 * Created by hjy on 17-8-15.
 * 测试自定义ArrayList
 */
public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList.get(3));   //获取数组下标为3的值:4
        arrayList.set(3,9); //设置第4个位置的值为9
        System.out.println(arrayList.get(3));   //再次获取，打印9
        System.out.println(arrayList.size()); //变长数组的长度为5,实际上内部数组长度为8,在add(2)和add(5)时，分别进行了数组长度翻倍及数组复制
    }


}
