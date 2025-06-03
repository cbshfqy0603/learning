package RecursionandPartition;

public class BinsearchPlus {
    public static void main(String[] args) {
        //法二：递归法
        //定义数组用于存储递增的数列
        int[] arr = {12, 15, 23, 27, 34, 39, 41, 49, 52, 56};
        //定义需要查找的值
        int key = 39;
        //定义左标值和右标志
        int left = 0;
        int right = arr.length - 1;
        //调用递归
        int result = binsearch(left, right, key, arr);
        if (result == -1) {
            System.out.println("没有找到");
        } else {
            System.out.println(key + "在数组arr中的索引为" + result);
        }
    }
    //我要做什么 -- 返回查找值的索引
    //我需要什么 -- 我需要左标志、右标志、需要判断的key值以及数组
    //是否需要返回值 -- 必须需要
    public static int binsearch(int left, int right, int key, int[] arr) {
        int mid = (left + right) / 2;
        //此处的判断很重要
        if (left <= right) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                return binsearch(mid + 1, right, key, arr);
            }
            if (arr[mid] > key) {
                return binsearch(left, mid - 1, key, arr);
            }
        }
        //如果left <= right条件不满足，说明查找失败
        return -1;
    }
}