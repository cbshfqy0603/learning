package RecursionandPartition;
//合并排序（归并排序）
//现有一乱序数列：8, 1, 7, 4, 5, 2, 3, 6
public class MergeSortDemo {
    public static void main(String[] args) {
        //定义数组用于存储乱序序列
        int[] arr = {8, 1, 7, 4, 5, 2, 3, 6};
        //打印数组
        System.out.println("排序前：");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf(arr[i] + " ");
            }
        }
        System.out.println();
        //定义左指针、右指针
        int left = 0;
        int right = arr.length - 1;
        //调用递归
        mergeSort(arr, left, right);
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf(arr[i] + " ");
            }
        }

    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left == right) {return;}//序列只有一个数直接返回
        else {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);//归并前半个子序列
            mergeSort(arr, mid + 1, right);//归并后半个子序列
            merge(arr, left, mid, right);//合并两个子序列
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] arr1 = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                arr1[k++] = arr[i++];
            } else {
                arr1[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            arr1[k++] = arr[i++];
        }
        while (j <= right) {
            arr1[k++] = arr[j++];
        }
        for (int i1 = 0; i1 < arr1.length; i1++) {
            arr[left + i1] = arr1[i1];
        }
    }


}
