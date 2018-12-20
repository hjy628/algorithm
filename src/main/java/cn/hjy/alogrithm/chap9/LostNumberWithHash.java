package cn.hjy.alogrithm.chap9;


import cn.hjy.alogrithm.ch01.HashTable;

/**
 *  寻找缺少的数字
 *  100个连续的数字(eg:1~100)，现在随机打乱顺序，然后随机取出一个数字，那么如何在这个数组中快速找出缺失的数字
 *  具体化问题:有一个长度为99的数组，在这个数组里存储了上面所述的100个数字被拿出1个后的99个数字，现在对数组进行处理以快速找出被拿出的数字
 *
 *  先对数组进行一次遍历，并存入散列表中。接着再对1~100的数进行一次遍历，分别判断是否存在于散列表中，
 *  如果存在，则说明在数组中有相应的数，如果不存在，则说明数组中没有相应的数，也就是缺失的那个数了
 */
public class LostNumberWithHash {

    /**
     *  借助散列表实现
     * @param  array
      */
    public static void find3(int[] array){
        HashTable hashTable = new HashTable();
        for (int i = 0; i < array.length; i++) {
            hashTable.put(array[i],1);
        }
        for (int i = 1; i <=100; i++) {
            //不存在
            if (hashTable.get(i)==-1){
                System.out.println("缺失的数字为： "+i);
                return;
            }
        }

    }


}
