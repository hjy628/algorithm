package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-17.
 * 汉诺塔的递归实现
 */
public class HanoiTest {

    public static void hanoi(int n,char A,char B,char C){
        if (n==1){
            //只有一个圆盘需要移动时，直接移动即可结束操作
            move(A,C);
            return;
        }
        //先把A上的n-1个圆盘移动到B上
        hanoi(n-1,A,C,B);
        //把A上最后一个圆盘移动到C上
        move(A,C);
        //接下来递归，把B上的n-1个圆盘移动到C上
        hanoi(n-1,B,A,C);
    }

    /**
     *   @Author
     *   @Description   把A最上面的圆盘移动到C上面去
     *   @Param   A
     *   @Param   C
     *   @Date: 上午11:05 17-8-17
     */
    private static void move(char A,char C){
        System.out.println(A + "--->" + C );
    }

    public static void main(String[] args) {
        hanoi(2,'A','B','C');
    }

}
