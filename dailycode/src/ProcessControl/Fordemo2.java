package ProcessControl;

public class Fordemo2 {
    public static void main(String[] args) {
        //求1-100之间所有偶数相加的和
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println("1-100之间所有偶数相加的和为:" + sum);
        //拓展求1-100之间能同时被3和6整除的数的和为多少，并且统计这些数的数量
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 8 == 0) {
                sum = sum + i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println("求1-100之间能同时被3和6整除的数的和为:" + sum);
        System.out.println("这些数的个数有:" + count + "个");
    }
}
