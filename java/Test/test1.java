package Test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*
        机票价格按照淡季旺季，头等舱经济舱来进行收费 输入机票原价，月份，舱位信息
        按照如下机票价格规则:
        (1)旺季(5-10月份)头等舱9折 经济舱8.5折
        (2)淡季(11月到来年4月份)头等舱7折经济舱6.5折
         */
        //输入机票原价，月份，舱位信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int ticket = sc.nextInt();
        System.out.println("请输入月份信息");
        int month = sc.nextInt();
        System.out.println("请输入您的舱位信息(0代表经济舱 1代表头等舱):");
        int seat = sc.nextInt();//其中0代表经济舱 1代表头等舱
        //判断是淡季还是旺季
        if (month >= 5 && month <= 10) {
            //旺季
            // 再继续判断是头等舱还是经济舱
            //注意此处可以直接使用idea快捷键ctrl + L + M直接抽取方法(小插曲:再加个回车)
            ticket = getTicket(seat, ticket, 0.85, 0.9);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            //再继续判断是头等舱还是经济舱
            ticket = getTicket(seat, ticket, 0.65, 0.7);
        } else {
            System.out.println("对不起，您输入的月份信息不合法");
        }
        //输出票价
        System.out.println("您的机票价格是:" + ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("对不起，您输入的舱位信息不合法");
        }
        return ticket;
    }
}
