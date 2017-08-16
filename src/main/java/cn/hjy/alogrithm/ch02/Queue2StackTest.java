package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 */
public class Queue2StackTest {

    public static void main(String[] args) {

        Queue2Stack stack = new Queue2Stack(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());    //2
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());    //4
        System.out.println(stack.pop());    //3

    }


}
