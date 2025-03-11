package Method;

public class MethodTest4 {
    //定义一个数组求最大值（最小值同理）
    public static void main(String[] args) {
        int[] arr = {1000, 450, 23232, 8998, 12345};
        System.out.println("数组的最大值为:" + getMax(arr));
    }

    //我要干什么  求最大值
    //我需要什么  数组
    //是否返回    需要
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
