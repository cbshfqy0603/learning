package DynamicPrograming;

import java.util.Scanner;

public class OneZeroBag {
    public static void main(String[] args) {
        int[] w = new int[100];//定义数组用于存储每个物品的重量
        int[] v = new int[100];//定义数组用于存储每个物品的价值
        //m[i][j]
        //定义二维数组用于存储目前的容量为j 前i个物品的最大价值
        int[][] m = new int[100][100];
        Scanner sc = new Scanner(System.in);
        //输入物品的个数
        int n = sc.nextInt();
        //输入背包的容量
        int c = sc.nextInt();
        //防止脏数据
        w[0] = 0;
        v[0] = 0;
        //输入每个物品对应的重量和价值
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        getMaxValue(n, c, w, v, m);
        System.out.println("当背包容量为c最大价值为：" + m[n][c]);

    }
    public static void getMaxValue(int n,int c, int[] w, int[] v, int[][] m) {
        //初始化边界条件
        for (int i1 = 0; i1 <= n; i1++) {
            m[i1][0] = 0;//背包容量为0时最大价值为0
        }
        for (int j = 0; j <= c; j++) {
            m[0][j] = 0;//当物品个数为0时最大价值为0
        }
        for (int i = 1; i <= n; i++) {
            //动态规划过程
            for (int j = 1; j <= c; j++) {
                if (w[i] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = getMax(m[i - 1][j], m[i - 1][j - w[i]] + v[i]);
                }
            }
        }
    }
    //定义一个函数 用于返回两个数之中的最大的那个数
    public static int getMax(int m, int n) {
        if (m >= n) {
            return m;
        }
        return n;
    }

}
