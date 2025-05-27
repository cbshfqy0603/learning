package Array;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，其元素为1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        如果元素为奇数那就×2
        如果元素为偶数为偶数那就÷2
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
