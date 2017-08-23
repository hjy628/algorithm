package cn.hjy.alogrithm.ch04;

/**
 * Created by hjy on 17-8-23.
 * 杨氏矩阵
 * 每一行和每一列都是递增的
 */
public class YangSearch {

    private int[][] array;

    public YangSearch(int[][] array) {
        this.array = array;
    }


    /**
     *   @Author
     *   @Description   递归实现
     *   @Date: 下午3:25 17-8-23
     */

    public boolean recursionSearch(int x,int y, int target){
        if (x == array.length || y == array[0].length){
            return false;
        }
        if (target < array[x][y]){
            return false;
        }
        if (target==array[x][y]){
            System.out.println(String.format("x: %d, y: %d",x,y));
            return true;
        }
        return recursionSearch(x+1,y,target)||recursionSearch(x,y+1,target);
    }


    /**
     *   @Author
     *   @Description   直接查找
     *   @Date: 下午3:28 17-8-23
     */
    public boolean search(int target){
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; target>=array[i][j]&&j < array[0].length; j++) {
                if (target==array[i][j]){
                    System.out.println(String.format("x: %d, y: %d",i,j));
                    return true;
                }else if (target<array[i][j]){
                    return false;
                }
            }
        }
        return false;
    }

    /**
     *   @Author
     *   @Description   优化的查找
     *   @Date: 下午3:28 17-8-23
     */
    public boolean search2(int target){
        int width = array[0].length;
        int height = array.length;
        if (target>=array[0][0]){
            int i = 0;
            //先从头开始第一行的查找
            for (;target>=array[0][i]&&i<width-1;i++){
                if (target==array[0][i]){
                    System.out.println(String.format("x: %d, y: %d",0,i));
                    return true;
                }
            }
            //该行未找到，修复i为矩阵范围内的数值
            if (i>width-1){
                i--;
            }
            //开始循环向下寻找
            for (int j = 0; j < height; j++) {
                if (array[j][i]==target){
                    System.out.println(String.format("x: %d, y: %d",j,i));
                    return true;
                }else if (array[j][i]>target){
                    for (;i>=0;i--){
                        if (array[j][i]==target){
                            System.out.println(String.format("x: %d, y: %d",j,i));
                            return true;
                        }else if (array[j][i]<=target){
                            break;
                        }
                    }
                    //该行未找到，修复i为矩阵范围内的数值
                    if (i<0){
                        i++;
                    }
                }else if (array[j][i]<target){
                    for (;i<width-1;i++){
                        if (array[j][i]==target){
                            System.out.println(String.format("x: %d, y: %d",j,i));
                            return true;
                        }else if (array[j][i]>=target){
                            break;
                        }
                    }
                    //该行未找到，修复i为矩阵范围内的数值
                    if (i>width - 1){
                        i--;
                    }
                }
            }
        }
        return false;
    }


    /**
     *   @Author
     *   @Description   定位查找
     *   @Date: 下午3:28 17-8-23
     */
    public boolean search3(int target){
        int i=0,j=array[0].length-1;
        int temp = array[i][j];
        while (true){
            if (temp == target){
                System.out.println(String.format("x: %d, y: %d",i,j));
                return true;
            }else if (temp < target && i <array.length-1){
                temp = array[++i][j];
            }else if (temp>target&&j>0){
                temp = array[i][--j];
            }else {
                //最终没有找到
                return false;
            }
        }
    }

}
