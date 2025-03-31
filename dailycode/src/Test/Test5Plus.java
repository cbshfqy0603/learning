package Test;

import java.util.Scanner;

public class Test5Plus {
    public static void main(String[] args) {
        /*
        需求:
        已知Test5中的案例是已知原始密码，要对其进行加密
        那么假使加密规则都是相同的，我现在要把加密后的密码给还原为原始密码
         */
        //输入加密后的密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后的密码:");
        int number = sc.nextInt();
        int temp = number;
        //首先思路和Test5中的相同，我需要把每一位数字都存储到数组之中
        //根据逆向思维动态初始化数组首先需要求出该数组的长度
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //逆向思维法:最终要得到数组，所以先把数组创建了，再看完善数组需要哪些操作即可
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            arr[index] = temp % 10;
            temp = temp / 10;
            index--;
        }
        printArr(arr);
        //接下来逆解密并输出结果即可
        //首先颠倒元素顺序
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        printArr(arr);
        //接下来分析%10 经过分析 若元素值为0-4 直接加10即可 若元素值为5-9不用进行任何处理
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }
        printArr(arr);
        //接下来数组中的所有元素统一减5即可
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        printArr(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }
        System.out.println("原始密码为:");
        System.out.println(result);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
