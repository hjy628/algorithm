package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 * 顺序队列
 */
public class ArrayQueue {

    private final Object[] items;

    private int head = 0;

    private int tail = 0;

    /**
     *   @Author
     *   @Description   初始化队列
     *   @Date: 上午10:28 17-8-16
     */
    public ArrayQueue(int capacity) {
        this.items = new Object[capacity];
    }


    /**
     *   @Author
     *   @Description   入队
     *   @Date: 上午10:30 17-8-16
     */
    public boolean put(Object item){
        if (head==(tail+1)%items.length){
            //说明队满
            return false;
        }
        items[tail] = item;
        tail = (tail+1)%items.length;   //tail标记向后移动一位
        return true;
    }

    /**
     *   @Author
     *   @Description   获取队列头元素，不出队
     *   @Date: 上午10:31 17-8-16
     */
    public Object peek(){
        if (head==tail){
            //说明队空
            return null;
        }
        return items[head];
    }

    /**
     *   @Author
     *   @Description   出队
     *   @Date: 上午10:33 17-8-16
     */
    public Object poll(){
        if (head==tail){
            //说明队空
            return null;
        }
        Object item = items[head];
        items[head]=null;   //把没用的元素赋空值，当然不设置也可以，反正标记移动了之后会覆盖
        head = (head+1) % items.length; //head标记向后移动一位
        return item;
    }

    public boolean isFull(){
        return head == (tail+1)%items.length;
    }

    public boolean isEmpty(){
        return head == tail;
    }

    /**
     *   @Author
     *   @Description   队列元素数
     *   @Date: 上午10:36 17-8-16
     */
    public int size(){
        if (tail>=head){
            return tail - head;
        }else {
            return tail + items.length - head;
        }
    }




}
