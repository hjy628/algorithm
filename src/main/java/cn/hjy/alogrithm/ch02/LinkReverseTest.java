package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 */
public class LinkReverseTest {

    public static void main(String[] args) {
        Link link = new Link();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        printAllElements(link);
        link.reverse();
        System.out.println("---------------------");
        printAllElements(link);

    }



    private static void printAllElements(Link link) {
        for (int i = 0; i < link.size(); i++) {
            System.out.println(link.get(i).getData());
        }
    }


}
