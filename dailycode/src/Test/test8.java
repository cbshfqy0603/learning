package Test;

public class test8 {
    public static void main(String[] args) {
        //1.二维数组的静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        //简化形式：
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //or(最推荐的方式)
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7}
        };
        //2.数组元素的访问 arr[i][j]
        //arr:二维数组
        //i:表示二维数组的索引 获取出来的是一维数组
        //j:表示一位数组的索引 获取出来的是真正的元素
        //结果为地址 arr3[0]代表一维数组
        System.out.println(arr3[0]);//[I@4eec7777
        System.out.println(arr3[0][2]);//3
        System.out.println(arr3[1][3]);//7
        //3.二维数组的遍历
        //外循环:遍历二维数组，得到里面的每一个一维数组
        for (int i = 0; i < arr3.length; i++) {
            //i：二维数组的索引
            //arr[i]；二维数组的元素（二维数组的元素就是一维数组）
            //内循环:遍历一维数组，得到里面的每一个元素
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        //华丽的分割线
        System.out.println("===================");
        //数组的动态初始化
        //注：此处的m不可以省略
        //int[][] arr4 = new int[m][n];
        //m表示这个二维数组可以存放多少个一维数组
        //n表示每一个一维数组可以存放多少个元素
        //int[][] arr5 = new int[][5]; ×
        //int[][] arr6 = new int[2][]; √
        int[][] arr4 = new int[2][3];
        int[] arr_1 = {1, 2, 3};//此处改为{1, 2}也是可以赋值的
        int[] arr_2 = {4, 5, 6};
        arr4[0] = arr_1;
        arr4[1] = arr_2;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
