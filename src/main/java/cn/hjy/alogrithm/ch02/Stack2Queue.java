package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 * 两个栈实现队列
 * 1：入队操作在stack1中执行，出队操作在stack2中执行
 * 入队：直接向stack1中入栈
 * 出队：将stack1中的所有元素出栈，一次入栈到stack2中，然后弹出stack2中的栈顶元素，接着把stack2中的所有元素出栈，依次压入stack1中
 *2:入队操作在stack1中执行，出队操作在stack2中执行,同时保证所有元素都在一个栈里
 * 入队：不管stack1是否为空栈，都将stack2中的所有元素压入stack1中
 * 出队：若stack2不为空栈，则直接从stack2中弹出元素，若stack2为空栈，则把stack1中的元素倒入stack2中，再从stack2中弹出元素
 * 若两个栈都是空的，则说明队列为空队，不能出队，与方案1思路一样，只不过把倒回去的这个操作放到了入队时执行，却使连续入队、出队的效率提高了
 * 3：入队操作在stack1中执行，出队操作在stack2中执行
 * 入队：直接把元素压入stack1中.
 * 出队:如果stack2不为空，则直接弹出stack2中的元素;如果stack2为空，则将stack1中的所有元素都倒入stack2中，然后弹出stack2中的栈顶元素。
 * 同样，若两个栈都为空栈，则队列为空队，无法出队
 */
public class Stack2Queue {

    private Stack stack1;
    private Stack stack2;
    private int maxLength;

    public Stack2Queue(int capacity) {
        this.maxLength = capacity;
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }


    public boolean put(int item){
        if (stack1.isFulll()||maxLength==size()){
            //满了
            return false;
        }
        stack1.push(item);
        return true;
    }

    public int poll(){
        if (!stack2.isEmpty()){
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public int size(){
        return stack1.size()+stack2.size();
    }

}
