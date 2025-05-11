package ProcessControl;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        /*
        从键盘分别获取一个除数和一个被除数
        要求不用% /求出商和余数
         */
        //被除数
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        //除数
        int divisor = sc.nextInt();
        //定义一个变量用来记录循环的次数(实际上就是商)
        int count = 0;
        while (dividend > divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商为:" + count);
        System.out.println("余数为:" + dividend);
    }
}
