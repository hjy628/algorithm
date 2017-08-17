package cn.hjy.alogrithm.ch03;

/**
 * Created by hjy on 17-8-17.
 * 冒泡排序优化
 * 1:增加标志位 增加一个变量来记录每趟排序中最后一次交换的位置，由于这个位置之后的元素已经不用交换了，说明后面的元素都完成排序了
 * 所以下次开始时可以直接从尾比较到这个位置
 * 2：一次冒泡两个元素   对于每趟比较，在倒着比较出最大的元素之后，再正着比较出最小的元素并使其沉下去，可以使排序趟数几乎减小一半
 *
 */
public class BubbleSort {

    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    /**
     *   @Author
     *   @Description   从小到大
     *   @Date: 下午3:16 17-8-17
     */
    public void sort(){
        int length = array.length;
        if (length>0){
            for (int i = 1; i < length; i++) {
                for (int j = 0; j < length - i; j++) {
                    if (array[j] > array[j+1]){
                        int temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }
    }


    /**
     *   @Author
     *   @Description   从大到小
     *   @Date: 下午3:16 17-8-17
     */
    public void sort2(){
        int length = array.length;
        if (length>0){
            for (int i = length-1; i >0; i--) {
                for (int j = length-1; j > length - 1 - i; j--) {
                    if (array[j] > array[j-1]){
                        int temp = array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp;
                    }
                }
            }
        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
