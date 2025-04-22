package Test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
       /*
       生成验证码
       内容：可以是小写字母，也可以是大写字母，还可以是数字
       规则：
       长度为5 内容中是四位字母，一位数字
       其中数字只有一位，但是可以出现在任意位置 */
       //将a-z A-Z 一共52个大小写字母存入数组
        char[] arr = new char[52];
        for (int i = 0; i < 52; i++) {
            if (i <= 25) {
                //存储a-z
                arr[i] = (char)(97 + i);
            } else {
                //存储A-Z
                arr[i] = (char)(65 + i - 26);
            }
        }
        //从数组中随机抽取4个字母，直接拼接即可
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            //随机生成0-(arr.length - 1)索引
            int index = r.nextInt(arr.length);
            result = result + arr[index];
        }
        //从0-9中随便选一个数字拼接在末尾即可
        int number = r.nextInt(10);
        result = result + number;
        //将生成的数字在5个位置随便选一个即可
        result = disorganize(result);
        //打印结果
        System.out.println(result);
    }
    //我要干什么 随机选择数字的位置
    //我需要什么 原字符串
    //原方法调用处是否需要返回值 需要(String)
    public static String disorganize(String str) {
        char[] chs = str.toCharArray();
        Random r = new Random();
        int randomIndex = r.nextInt(str.length());
        //数字元素在最后一位
        char temp = chs[str.length() - 1];
        chs[str.length() - 1] = chs[randomIndex];
        chs[randomIndex] = temp;
        return new String(chs);
    }
}