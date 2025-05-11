package Test;

public class Test2 {
    public static void main(String[] args) {
        //判断101-200之间有多少个素数(质数)，并把所有的素数打印出来
        //定义一个变量用于计算素数的个数
        int count = 0;
        //利用循环产生数字101-200
        for (int i = 101; i < 200; i++) {
            //若是素数则为true 不是为false
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                //只要有一个数能被i整除就说明i不是素数
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("数字" + i + "是素数");
                count++;
            }
        }
        System.out.println("101-200之间素数的个数为:" + count);
        //首先判断一个数i是不是素数
        /*int i = 7;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            //只要有一个数能被i整除就说明i不是素数
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("数字" + i + "是素数");
        }*/
    }
}
