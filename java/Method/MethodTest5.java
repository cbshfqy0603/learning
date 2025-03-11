package Method;

import java.util.Scanner;

//判断一个数字是否存在
public class MethodTest5 {
    public static void main(String[] args) {
        int[] arr = {123, 34, 56, 78, 90};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (contains(arr, number)) {
            System.out.println("这个数字存在于数组之中");
        } else {
            System.out.println("这个数字不存在于数组之中");
        }
    }

    //我要干什么
    //我需要什么
    //是否要返回值
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        //注意此处绝对不能用if else语句进行不存在于数组这个判断 因为这样就只相当于只判断了一个元素
        return false;
    }
}
//return关键字和break关键字的区别
//return:return关键字其实跟循环没什么关系，它只跟方法有关系
//(1)表示结束整个方法(2)