package cn.hjy.alogrithm.ch07;

/**
 * Created by hjy on 17-11-15.
 * 将字符串转换为数字
 */
public class StringUtils3 {


    public static int toInt(String str){
        if (str==null||str.length()==0){
            throw new RuntimeException("字符串为空");
        }

        //转换结果
        int reult = 0;
        //转换的字符
        int current = 0;
        //整数的正负
        char sign = '+';

        //如果首位是符号的话，则赋值符号正负
        if (str.charAt(0)=='-' || str.charAt(0)=='+'){
            sign = str.charAt(0);
            //如果有符号，则转换内容并截取首位字符
            str = str.substring(1);
        }

        //是否需要判断溢出
        boolean judgeOverflow = true;
        if (str.length()>10){
            throw new RuntimeException("整型溢出了");
        }else if (str.length()<10){
            judgeOverflow = false;
        }

        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i)-'0';
            if (current>9||current<0){
                throw new RuntimeException("包含非整型数字字符");
            }
            if (judgeOverflow){
                if (sign=='+'&&(reult==0||reult==Integer.MAX_VALUE/(int)Math.pow(10,9-i+1))&&
                        current>Integer.MAX_VALUE/(int)Math.pow(10,9-i)%10){
                    System.err.println(current);
                    throw new RuntimeException("整型溢出了");
                }
                if (sign=='-'&&(reult==0||reult==-Integer.MIN_VALUE/(int)Math.pow(10,9-i+1))&&
                        current>-Integer.MAX_VALUE/(int)Math.pow(10,9-i)%10){
                    System.err.println(current);
                    throw new RuntimeException("整型溢出了");
                }
            }

            reult = reult*10+current;

        }
        if (sign == '-') {
            reult = -reult;
        }
        return reult;
        }

}
