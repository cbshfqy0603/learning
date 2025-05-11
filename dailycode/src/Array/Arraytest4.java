package Array;

public class Arraytest4 {
    public static void main(String[] args) {
        //已知数组元素{33, 32, 98, 76, 56}
        //求数组最大值和数组最小值
        int[] arr = {33, 32, 98, 76, 56};
        //用于记录当前的数组最大值
        int max = arr[0];
        //用于记录当前的数组最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("数组中最大的值为:" + max);
        System.out.println("数组中最小的值为:" + min);
    }
}
