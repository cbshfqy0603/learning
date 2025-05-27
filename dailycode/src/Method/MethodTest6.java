package Method;

public class MethodTest6 {
    public static void main(String[] args) {
        /*需求:定义一个copyOfRange(int[] arr, int from, int to)
        要求把老数组从from索引(包括from)到to索引(不包括to)复制到新数组中，并返回新数组
        同时把新老数组遍历对比
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copyArr = copyOfRange(arr, 4, 9);
        System.out.println("老数组:");
        printArr(arr);
        System.out.println("新数组:");
        printArr(copyArr);
    }

    //用于对数组进行打印
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        //伪造索引的思想 没有索引就自己创建一个
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}