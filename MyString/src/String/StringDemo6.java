package String;

public class StringDemo6 {
    public static void main(String[] args) {
        //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
        //调用这个方法，并在控制台输出结果
        //例如：
        //数组为 int[] arr = {1, 2, 3};
        //执行方法后的结果为：[1, 2, 3]
        int[] arr = {1, 2, 3};
        int[] arr1 = {};
        int[] arr2 = new int[4];
        String s = arrToString(arr2);
        System.out.println(s);
    }
    //我要干什么 --- 遍历数组，并把数组拼成指定格式的字符串返回
    //为了干成这件事我需要什么 --- 数组
    //是否需要把结果返回调用出 --- 需要返回一个字符串
    public static String arrToString(int[] arr) {
        //数组不存在
        if (arr == null) {
            return "";
        }
        //数组存在，但是没有元素（数组为空）
        if (arr.length == 0) {
            return "[]";
        }
        //数组存在，且长度不为0
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            //i:索引  arr[i]：元素
            if (i == arr.length - 1) {
                result = result + arr[i] + "]";
            } else {
                result = result + arr[i] + ", ";
            }
        }
        return result;
    }
}
