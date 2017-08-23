package cn.hjy.alogrithm.ch04;

/**
 * Created by hjy on 17-8-23.
 */
public class YangSearchTest {

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9,15,22,38}
                ,{2,5,9,12,16,25,42}
                ,{4,7,13,15,21,28,46}
                ,{7,9,16,18,24,32,52}};

        YangSearch yangSearch = new YangSearch(array);
        System.out.println("递归查找： ");
        System.out.println(yangSearch.recursionSearch(0,0,13));
        System.out.println(yangSearch.recursionSearch(0,0,20));
        System.out.println("直接查找： ");
        System.out.println(yangSearch.search(13));
        System.out.println(yangSearch.search(20));

        System.out.println("优化查找： ");
        System.out.println(yangSearch.search2(13));
        System.out.println(yangSearch.search2(20));
        System.out.println(yangSearch.search2(46));
        System.out.println(yangSearch.search2(4));
        System.out.println(yangSearch.search2(99));

        System.out.println("定位查找： ");
        System.out.println(yangSearch.search3(13));
        System.out.println(yangSearch.search3(20));

    }




}
