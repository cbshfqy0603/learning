package ProcessControl;

import java.util.Random;
import java.util.Scanner;

/*
生成任意数到任意数之间随机数的方法
以7~18为例
(1)左右两边同时减去一个相同的数是范围变成0~某某 7~18->0~11
(2)尾部加一输入到r.nextInt()里面
(3)表达式加上第一步减去的数即可
 */
public class test7 {
    public static void main(String[] args) {
    /*
    随机生成1~100中的任意数，进行猜数字游戏
     */
        Random r = new Random();
        //此处的加一一定不要忘
        int number = r.nextInt(100) + 1;//1-100 0-99(-1) 99+1 表达式+1
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int guessnumber = sc.nextInt();
            if (guessnumber > number) {
                System.out.println("猜大了");
            } else if (guessnumber < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你，猜对了😊");
            }
        }
    }
}
