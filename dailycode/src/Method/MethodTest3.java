package Method;

//遍历数组 要求最后打印结果:[11, 22, 33, 44, 55]
public class MethodTest3 {
    public static void main(String[] args) {
        //首先定义一个数组
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
        /*有关打印语句的补充
        System.out.println("abc");//打印abc,然后换行
        System.out.print("bcd");//打印bcd，不换行
        System.out.println();//什么都不打印 == 只换行*/
    }

    public static void printArr(int[] arr) {
        //打印[
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //最后一个数组元素不必在后面加上
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        //打印]
        System.out.print("]");
    }
}
