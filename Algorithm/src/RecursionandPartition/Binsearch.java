package RecursionandPartition;
//二分查找 针对一组单调（增or减的数列）
//12 15 23 27 34 39 41 49 52 56
public class Binsearch {
    public static void main(String[] args) {
        //法一：循环法
        //定义一个数组用来存储单调递增数列12 15 23 27 34 39 41 49 52 56
        int[] arr = {12, 15, 23, 27, 34, 39, 41, 49, 52, 56};
        //定义一个需要查找的数字
        int key = 39;
        //需要一个标志来表明是否完成查找,同时需要一个变量记录数字在数组中索引的位置
        int flag = -1;
        //初始化左标志left right mid
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            //每次训话后mid都需要更新
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                flag = mid;
                break;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            }
            if (arr[mid] > key) {
                right = mid - 1;
            }
        }
        if (flag == -1) {
            System.out.println("没有找到");
        } else {
            System.out.println(key + "在arr中的索引为" + flag);
        }

    }
}
