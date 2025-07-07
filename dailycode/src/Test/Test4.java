package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求:在某档综艺节目中，一共有6名评委要给选手打分，分数范围为[0-100]
        选手最终的成绩:去掉一个最高分和一个最低分后取平均数
         */
        //1.定义一个数组来记录每一名评委的打分
        int[] scoreArr = getArr();
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.println(scoreArr[i]);
//        }
        //2.求最高分
        int max = getMax(scoreArr);
        //3.求最低分
        int min = getMin(scoreArr);
        //4.求所有评委打分之和
        int sum = getSum(scoreArr);
        //5.求选手最终的成绩
        int result = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("该选手最终的成绩为:" + result);
    }

    //求所有评委打分之和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    //求最高分
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //求最低分
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //我要干什么 定义一个数组 用于存储6名评委的打分
    //我需要什么 什么都不需要1
    //是否需要返回值 返回数组
    //定义一个数组用来存储6名评委的打分
    public static int[] getArr() {
        //定义数组(动态初始化)
        int[] scores = new int[6];
        //输入评分
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("第" + (i + 1) + "位评委请输入你的打分:");
            int score = sc.nextInt();
            //在1-100范围的成绩就正常录入数组，不然重新输入
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                //此处的i++必须写在这，不然不能重新输入
                i++;
            } else {
                System.out.println("亲爱的第" + (i + 1) + "位评委，您的输入的分数不合法，请重输:");
            }

        }
        return scores;
    }
}
