package Array;

import java.util.Random;

public class Arraytest5 {
    public static void main(String[] args) {
        /*
    需求：随机将10个随机数存入数组 并求出数组的元素之和 数组元素的平均值 有多少个数比平均数小
     */
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        //求出数组的元素之和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组的元素之和为:" + sum);
        //求数组元素的平均值
        int avg = sum / arr.length;
        System.out.println("数组元素的平均值为:" + avg);
        //统计比平均数小的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("比平均数小的数组元素有" + count + "个");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
