package Test;

import java.util.Random;
import java.util.Scanner;

//双色球彩票系统
public class test7 {
    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = creatNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("====================");
        //用户输入中奖号码
        int[] userInputArr = userInputNumber();
//        for (int i = 0; i < userInputArr.length; i++) {
//            System.out.print(userInputArr[i] + " ");
//        }
        //判断用户的中奖情况
        //分为两种情况:(1)红球中了几个(2)蓝球中了几个
        int redcount = 0;
        int bluecount = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length; j++) {
                if (redNumber == arr[i]) {
                    redcount++;
                    break;
                }
            }
        }
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            bluecount++;
        }
        System.out.println("所中红球的个数为:" + redcount);
        System.out.println("所中蓝球的个数为:" + bluecount);
        if (redcount == 6 && bluecount == 1) {
            System.out.println("恭喜你,中了1000万");
        } else if (redcount == 6 && bluecount == 0) {
            System.out.println("恭喜你,中了500万");
        } else if (redcount == 5 && bluecount == 1) {
            System.out.println("恭喜你,中了3000块");
        } else if ((redcount == 5 && bluecount == 0) || (redcount == 4 && bluecount == 1)) {
            System.out.println("恭喜你,中了200块");
        } else if ((redcount == 4 && bluecount == 0) || (redcount == 3 && bluecount == 1)) {
            System.out.println("恭喜你,中了10块");
        } else if ((redcount == 2 && bluecount == 1) || (redcount == 1 && bluecount == 1) || (redcount == 0 && bluecount == 1)) {
            System.out.println("恭喜你,中了5块");
        } else {
            System.out.println("谢谢参与");
        }


    }

    public static int[] userInputNumber() {
        //创建数组用于存储用户的彩票号码
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        //首先输入红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "位红色号玛:");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("你他妈是不是瞎 SB 你他妈一个号码都能输重");
                }
            } else {
                System.out.println("你他妈长点眼睛 号码输错了");
            }
        }
        //再输入蓝球号码
        while (true) {
            System.out.println("请输入最后的蓝色号码:");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("你他妈 不输错会死啊 SB");
            }
        }
        return arr;
    }

    //生成7位数中奖号码
    public static int[] creatNumber() {
        //创建一个数组用于存储中奖号码(6个红球 1个蓝球)
        int[] arr = new int[7];
        //红球号码:6个不重复的数字 范围:1-33
        //蓝球号码:1个 可以和红球重复 范围:1-16
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //生成1-33的随机数
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        //生成1-16的随机数
        int blueNumber = r.nextInt(15) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //我要干什么 判断红球号码生成的随机数是否重复
    //我需要什么 存储中奖号码的数组 当前生成的随机数
    //是否需要返回值 需要布尔类型的返回值
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
