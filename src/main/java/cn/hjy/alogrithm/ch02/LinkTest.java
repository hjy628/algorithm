package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 */
public class LinkTest {

    public static void main(String[] args) {
        Link link = new Link();
        link.addFirst(2);
        link.addFirst(1);
        link.addLast(4);
        link.addLast(5);
        link.add(3, 1);  //在下标为1的元素之后插入元素
        printAllElements(link); //12345
        link.printAll();//这样打印效率更高
        link.removeFirst();
        link.removeLast();
        link.removeMiddle(1);
        printAllElements(link);//移除头尾之后，剩下三个元素，移除下标为1的元素，只剩下两个元素2,4
        link.removeFirst();
        link.removeFirst();
        System.out.println(link.size());//从头部全部移出

    }

    private static void printAllElements(Link link) {
        for (int i = 0; i < link.size(); i++) {
            System.out.println(link.get(i).getData());
        }
    }


}
