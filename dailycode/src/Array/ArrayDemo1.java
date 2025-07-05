package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义数组
        //两种格式：(1)数据类型[] array (2)数据类型 array[]
        //初始化：就是在内存中为数据容器开辟空间，并将数据存入数据容器中的过程
        //数组的初始化：(1)静态初始化(2)动态初始化
        //数组的静态初始化：完整格式和简化格式
        //数组在进行静态初始化后其长度就不会再次发生变化
        //(1)int[] arr = new int[]{};
        //(2)int arr[] = {};
        //实例代码：java反正是这么写的 c/c++就是 int arr[] = {};
        int[] arr = {1, 23, 4, 5, 6, 7};
        double[] arr1 = new double[]{1.2, 1.4, 8.2, 9.4};
        //数组的地址
        System.out.println(arr);//[I@4eec7777
        System.out.println(arr1);//[D@3b07d329
        //[:代表这个是一个数组
        //I:代表数组里面的数据都是int类型的
        //@:间隔符号,固定格式
        //4eec7777->真正的地址
        //但是我们一般习惯把这个整体称为地址
        //数组元素的访问 数组名[索引下标]
        System.out.println(arr[0]);
        //数组元素的遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
