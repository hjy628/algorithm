package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 * 两个队列实现栈
 * 1:入栈和出栈，都在queue1中完成，而queue2作为中转空间
 * 入栈：直接入queue1即可，
 * 出栈：把queue1中除最后一个元素外的所有元素都移动到queue2中，再将queue1中的元素出队，此时即出栈
 * 接着将queue2中的所有元素都移动到queue1中
 *
 * 2:
 * 入栈：两个队列哪个不为空，就把元素入队到哪个队列中，如果都为空，则任选一个队列入队，假设这个对列就是queue1
 * 出栈：把不为空的队列中除最后一个元素外的所有元素移动到另一个队列中，然后出队最后一个元素
 */
public class Queue2Stack {

    private ArrayQueue queue1;
    private ArrayQueue queue2;
    private int maxLength;

    public Queue2Stack(int capacity) {
        this.maxLength = capacity;
        queue1 = new ArrayQueue(capacity);
        queue2 = new ArrayQueue(capacity);
    }

    /**
     *   @Author
     *   @Description   入栈 返回入栈结果
     *   @Date: 下午2:21 17-8-16
     */
    public boolean push(int item){
        if (size() == maxLength){
            return false;
        }
        if (queue2.isEmpty()){
            queue1.put(item);
        }else {
            queue2.put(item);
        }
        return true;
    }

    /**
     *   @Author
     *   @Description   出栈
     *   @Date: 下午2:24 17-8-16
     */
    public Object pop(){
        if (size()==0){
            throw new IndexOutOfBoundsException("栈里空了");
        }else {
            if (queue2.isEmpty()){
                while (queue1.size()>1){
                    queue2.put(queue1.poll());
                }
                return queue1.poll();
            }else {
                while (queue2.size()>1){
                    queue1.put(queue2.poll());
                }
                return queue2.poll();
            }
        }
    }

    public int size(){
        return queue1.size() + queue2.size();
    }

}
