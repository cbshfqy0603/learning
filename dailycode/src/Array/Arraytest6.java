package Array;

public class Arraytest6 {
    public static void main(String[] args) {
        //已知一个数组，其中的元素为{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        //交换前:1 2 3 4 5 6 7 8 9 10
        //交换后:10 9 8 7 6 5 4 3 2 1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
