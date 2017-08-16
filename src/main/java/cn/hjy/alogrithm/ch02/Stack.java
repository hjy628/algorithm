package cn.hjy.alogrithm.ch02;

import java.util.Arrays;

/**
 * Created by hjy on 17-8-16.
 */
public class Stack {

    private int size = 0;

    private int[] array;

    public Stack() {
        this(10);
    }

    public Stack(int init) {
        if (init<=0){
            init=10;
        }
        array = new int[init];
    }

    /**
     *   @Author
     *   @Description   入栈
     *   @Date: 上午10:03 17-8-16
     */
    public void push(int item){
        if (size == array.length){
            array = Arrays.copyOf(array,size*2);
        }
        array[size++] = item;
    }

    /**
     *   @Author
     *   @Description   获取栈顶元素，但是没有出栈
     *   @Date: 上午10:05 17-8-16
     */
    public int peek(){
        if (size==0){
            throw new IndexOutOfBoundsException("栈已空");
        }
        return array[size-1];
    }

    /**
     *   @Author
     *   @Description   出栈,同时获取栈顶元素
     *   @Date: 上午10:05 17-8-16
     */
    public int pop(){
        int item = peek();
        size--; //直接使元素个数减1,不需要真的清除元素，下次入栈会覆盖旧元素的值
        return item;
    }

    /**
     *   @Author
     *   @Description   栈是否满了
     *   @Date: 上午10:08 17-8-16
     */
    public boolean isFulll() {
        return size == array.length;
    }

    /**
     *   @Author
     *   @Description   栈是否为空栈
     *   @Date: 上午10:08 17-8-16
     */
    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }


}
