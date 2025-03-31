package Array;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
        定义一个数组，其元素为1，2，3，4，5，6，7，8，9，10
        找出能被3整除的元素的个数以及这些元素的值
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("能被3整除的元素个数:" + count);
    }
}
