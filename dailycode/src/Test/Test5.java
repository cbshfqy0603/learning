package Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        某数字系统的密码(大于0)，例如1983，采用加密传输的方式
        规则如下:
        每一位数字加上5
        然后每一位数再%10
        最后将数字反转
         */
        System.out.println("请输入原始密码:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //number在用于统计数组的长度之后变为0，所以需要一个临时的变量来存储number的值
        int temp = number;
        //用于计算数字的位数(也就是数组的长度)
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //利用动态初始化的方法来创建数组
        int[] arr = new int[count];
        //没有索引就创造索引
        int index = arr.length - 1;
        //把每位数字单独存储到数组之中
        while (temp != 0) {
            arr[index] = temp % 10;
            temp = temp / 10;
            index--;
        }
        extracted(arr);
        //已经把每一位都存储进数组之中了，现在就要开始实现加密规则了
        //把每一位数字都加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        System.out.println("把每一位数字都加上5后:");
        extracted(arr);
        //把每一位数字都%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        System.out.println("把每一位数字都%10后:");
        extracted(arr);
        //最后一步把数组中所有元素的顺序颠倒
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temper = arr[i];
            arr[i] = arr[j];
            arr[j] = temper;
        }
        System.out.println("把数组中所有元素的顺序颠倒后:");
        extracted(arr);
        //拼接打印即可
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }
        System.out.println("最终加密后的密码为:" + result);
    }

    private static void extracted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
