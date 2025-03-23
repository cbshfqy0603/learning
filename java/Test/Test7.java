package Test;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        //生成中奖号码

    }

    //我需要干什么 获得中奖号码
    //我需要什么 什么都不需要
    //是否许需要返回值 需要返回一个数组
    public static int[] getNumber() {
        //1.定义一个数组用于添加号码
        //红球6个 蓝球1个 总共7个
        int[] arr = new int[7];
        //先来添加红球 1-33 随机数字 且6个号码不能重复
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int randomNumber = r.nextInt(33) + 1;
            if () {
                
            }
            arr[i] = randomNumber;

        }
    }
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
