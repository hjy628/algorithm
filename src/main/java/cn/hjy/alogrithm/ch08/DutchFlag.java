package cn.hjy.alogrithm.ch08;

public class DutchFlag {


    /**
     *   @Description   荷兰国旗问题
     *   @Param   array
     *   @Date: 下午4:42 18-5-3
     */
    public static void sort(int[] array){
        int begin = 0;
        int end = array.length -1;
        int current = 0;
        while (current<=end){
            if (array[current]==0){
                swap(array,current,begin);
                begin++;
                current++;
            }else if (array[current]==1){
                current++;
            }else if (array[current]==2){
                swap(array,current,end);
                end--;
            }
        }

        System.out.print("排序后结果: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i!=array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }



    private static void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }


    public static void main(String[] args) {
        int[] array1= {1,1,0,0,2,2,1,0,1,2,1,0,2};
        int[] array2= {0,1,0,0,2,2,1,0,1,2,1,0,1};
        sort(array1);
        sort(array2);


    }

}
