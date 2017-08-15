package cn.hjy.alogrithm.ch01;

import java.util.Arrays;

/**
 * Created by hjy on 17-8-15.
 */
public class ArrayList {

    private static final int INITIAL_SIZE = 10;

    private int size = 0;

    private int[] array;

    public ArrayList() {
        array = new int[INITIAL_SIZE];
    }

    public ArrayList(int initial) {
        if (initial<=0){
            initial = INITIAL_SIZE;
        }
        array = new int[initial];
    }


    /**
    *   @Author hjy
    *   @Description    添加元素
    *   @Param   num
    *   @Date: 下午4:15 17-8-15
    */
    public void add(int num){
        if (size==array.length){
            array = Arrays.copyOf(array,size*2);
        }
        array[size++]=num;
    }

    /**
     *   @Author hjy
     *   @Description   获取指定位置的元素值
     *   @Param  i
     *   @Date: 下午4:17 17-8-15
     */
    public int get(int i){
        if (i >= size ){
            throw new IndexOutOfBoundsException("获取的元素位置超过了最大长度");
        }
        return array[i];
    }

    /**
     *   @Author
     *   @Description   设置指定位置的元素值
     *   @Param   i
     *   @Param   num
     *   @Date: 下午4:20 17-8-15
     */
    public int set(int i, int num){
        int oldNum = get(i);
        array[i] = num;
        return oldNum;
    }

    /**
     *   @Author
     *   @Description  获取变长数组的长度
     *   @Param
     *   @Date: 下午4:22 17-8-15
     */
    public int size(){
        return size;
    }


}
