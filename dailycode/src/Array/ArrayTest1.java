package Array;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，其元素为1，2，3，4，5
        输出他们的和
         */
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("他们的和为:" + sum);
    }
}
