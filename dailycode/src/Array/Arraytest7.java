package Array;

import java.util.Random;

public class Arraytest7 {
    public static void main(String[] args) {
        //打乱数据
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random r = new Random();
        //未打乱前：
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int randomindex = r.nextInt(5);
            int temp = arr[i];
            arr[i] = arr[randomindex];
            arr[randomindex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
