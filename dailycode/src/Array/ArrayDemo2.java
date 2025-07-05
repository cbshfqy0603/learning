package Array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //动态初始化:初始化时只定义数组长度，由系统自动为数组分配初始化值(系统默认的初始化值)
        String[] arr = new String[50];
        //添加
        arr[0] = "张三";
        arr[1] = "李四";
        System.out.println(arr[0]);//张三
        System.out.println(arr[1]);//李四
        System.out.println(arr[2]);//null
        //系统默认初始化值的规律
        //整数类型：默认初始化值为0
        //小数类型：默认初始化值为0.0
        //字符串类型：默认初始化值为'/0000' 其实就是空格
        //布尔数据类型：默认初始化值为false
        //引用数据类型：默认初始化值为null
        int[] arr1 = new int[5];
        System.out.println(arr1[0]);//0
        //数组的静态初始化：知道具体数值
        //数组的动态初始化：只知道长度，不知道具体数值
        //数组的常见问题：索引越界 最小索引0 最大索引数组长度-1
    }
}
