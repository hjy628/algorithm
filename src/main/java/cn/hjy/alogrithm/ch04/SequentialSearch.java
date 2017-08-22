package cn.hjy.alogrithm.ch04;

/**
 * Created by hjy on 17-8-21.
 * 顺序查找
 *
 *
 * ASL(Average Search Length,平均查找长度)
 * 需要和要查找的key进行比较的期望次数,被成为查找算法的平均查找长度
 * 查找成功时的ASL的计算公式为ASL=Pi*Ci 其中Pi为查找表中第i个元素的概率,Ci为找到第i个元素时已经比较过得次数
 */
public class SequentialSearch {

    private int array[];

    public SequentialSearch(int[] array) {
        this.array = array;
    }

    /**
     *   @Author
     *   @Description   直接顺序查找
     *   @Param   key
     *   @Date: 下午4:58 17-8-21
     */
    public int search(int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==key){
                return i;
            }
        }
        return -1;
    }


    /**
     *   @Author
     *   @Description   哨兵方式顺序查找
     *   @Param   key
     *   @Date: 下午4:58 17-8-21
     */
    public int search2(int key){
        //先判断是否等于下标为0的元素
        if (key==array[0]){
            return 0;
        }

        //临时保存array[0]的值
        int temp = array[0];

        //赋值给下标为0的元素
        array[0] = key;
        int i = array.length -1;
        //倒序比较
        while (array[i] != key){
            i--;
        }
        //把array[0]原本的值赋回去
        array[0] = temp;
        //比较到最后了也没有找到，则返回-1;
        if (i==0){
            return -1;
        }
        //找到了的话，则返回数组下标
        return i;
    }

}
