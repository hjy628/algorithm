package cn.hjy.alogrithm.chap9;


import cn.hjy.alogrithm.ch01.HashTable;

/**
 * 出现次数超过一半的数字(散列表)
 *  在想要快速查找时，人们总是会想到散列表。不管怎么说，散列表是能够降低算法的时间复杂度的数据结构。
 *  虽然在想到散列表的那一刻已经做好了牺牲空间复杂度的准备。但是在很多时候，对于很多问题，散列表确实是一个简单，快捷的解决手段
 *
 *
 * 思路:  散列表中的key就是元素值，value就是出现次数。
 * 首先遍历一遍数组，针对每个元素的值，如果在散列表中存在该值，就取出来，加1后再放回去；如果不存在，则直接设置为1；
 * 可以在一切结束之后遍历一遍散列表，看哪个元素的值的出现次数超过数组长度的一半，就输出这个元素值。
 * 更简单的就是在遍历到指定元素时，如果发现加1之后，其出现次数已经大于数组长度的一半，那么直接输出结果就好，不需要再继续遍历下去了。
 *
 */



public class MoreThanHalfWithHash {

    /**
     * 借助散列表查找  时间复杂的O(n)
     * @param  array
     *
     * */

    public static void find2(int[] array){
        //如果数组元素只有一个，
        if (array.length==1){
            System.out.println("找到了，这个元素为"+array[0]);
            return;
        }

        HashTable hashTable = new HashTable();
        for (int i = 0; i < array.length; i++) {
            int count = hashTable.get(array[i]);
            if (count>0){
                count++;
                //说明存在，如果达成条件，则直接输出
                if (count>array.length/2){
                    System.out.println("找到了，这个元素为"+array[i]);
                    return;
                }
                hashTable.put(array[i],count);
            }else {
                hashTable.put(array[i],1);
            }
        }
        System.out.println("没有找到");



    }


}
