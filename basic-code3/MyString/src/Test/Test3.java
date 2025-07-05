package Test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘录入字符串，并打乱字符串
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("字符串打乱前：");
        System.out.println(str);
        //将字符串转变字符数组
        char[] arr = str.toCharArray();
        //调用方法打乱字符数组，并将字符数组转变成字符串返回
        String result = disorganize(arr);
        System.out.println("将字符串打乱后：");
        System.out.println(result);
    }

    //打乱字符数组各个元素的顺序，并返回字符串（根据字符数组创建一个新的字符串）
    public static String disorganize(char[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return new String(arr);
    }
}
