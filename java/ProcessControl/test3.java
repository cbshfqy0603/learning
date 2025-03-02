package ProcessControl;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /*
        需求：从键盘获取一个数并判断这个数是否是回文数
        回文数：倒序和逆序相等的数 例：121是回文数，而12345则不是回文数
         */
        Scanner sc = new Scanner(System.in);
        //从键盘获取一个数
        int x = sc.nextInt();
        //因为在执行每次循环的时候x最终的结果已经发生了变化所以需要一个变量来存储初始x
        int temp = x;
        //定义一个变量用来存储最终的结果
        int num = 0;
        while (x != 0) {
            //获取最后一个数
            int ge = x % 10;
            //更新x
            x = x / 10;
            //更新num
            num = num * 10 + ge;
        }
        System.out.println("逆序后的结果为：" + num);
        if (temp == num) {
            System.out.println("这个数是回文数");
        } else {
            System.out.println("这个数不是回文数");
        }
    }
}
