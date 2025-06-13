package RecursionandPartition;

public class QuickSortDemo {
    public static void main(String[] args) {
        //定义乱序序列
        int[] arr = {3, 7, 8, 9, 1, 4, 2, 6, 5};
        System.out.println("未进行排序操作前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();//换行
        //定义左指针，右指针
        int left = 0;
        int right = arr.length - 1;
        //调用快速排序
        QuickSort(arr, left, right);
        System.out.println("进行排序操作后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
    public static void QuickSort(int[] arr, int left, int right) {
        if (left < right) {
            int flag = Partition(arr, left, right);//获取轴值用于划分子问题
            QuickSort(arr, left, flag - 1);
            QuickSort(arr, flag + 1, right);
        }
    }
    public static int Partition(int[] arr, int left, int right) {
        int temp = 0;
        while (left < right) {
            //左指针不动，右指针-1（扫描）
            while (left < right && arr[left] <= arr[right]) {
                right--;
            }
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            //右指针不动，左指针+1（扫描）
            while (left < right && arr[left] <= arr[right]) {
                left++;
            }
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //此时left == right
        return left;
    }
}
