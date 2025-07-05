package StringDemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        //定义一个方法，将字符串反转
        //键盘录入一个字符串，调用该方法后，在控制台输出结果
        //例如，键盘录入abc.输出结果cba
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String result = sc.next();
        System.out.println("未进行字符串反转前：");
        System.out.println(result);
        result = reversal(result);
        System.out.println("进行字符串反转后：");
        System.out.println(result);
    }
    //我需要干什么 --- 将字符串进行反转
    //我需要什么 --- 字符串
    //是否需要返回值 --- 返回反转后的字符串
    //一键修改变量名 fn + shift + f6
    public static String reversal(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
