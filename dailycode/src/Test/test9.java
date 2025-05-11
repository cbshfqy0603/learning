package Test;

public class test9 {
    public static void main(String[] args) {
        //需求；计算每个季度的营业和以及全年的总营业额
        /*
        {22, 66, 44}
        {77, 33, 88}
        {25, 45, 65}
        {11, 66, 99}
         */
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            int quarterSum = getSum(yearArr[i]);
            System.out.println("第" + (i + 1) + "个季度的营业额为：" + quarterSum);
            yearSum = yearSum + quarterSum;
        }
        System.out.println("全年的营业额为:" + yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
