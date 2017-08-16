package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 * 栈可用于逆序输出，语法检查，符号成对出现，以及数制转换（将十进制的数转换为2-9的任意进制的数）
 * 求余法，除以8,记录余数，一直等到商为0位置，最后将余数到这些出来就可以
 * 100%8 = 12-4 push4 12%8 = 1-4 push4 1%8 0-1 push1 poppoppop=144
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack(1); //为了方便看出效果，设定初始数组长度为1
        stack.push(1);
        stack.push(2);
        System.out.println(stack.size());   //栈内元素个数为2,当前数组长度也为2
        stack.push(3);
        System.out.println(stack.size());   //栈内元素个数为3,当前数组长度也为4
        System.out.println(stack.peek());   //获取栈顶元素，3,但是没有出栈
        System.out.println(stack.size());   //由于上面一行没有出栈，所以元素个数还是3
        System.out.println(stack.pop());    //栈顶元素出栈，返回3
        System.out.println(stack.pop());    //栈顶元素出栈，返回2
        System.out.println(stack.size());   //出了两次栈，当前元素个数为1
    }

}
