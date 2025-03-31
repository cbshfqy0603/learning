package Test;

import java.util.Scanner;

public class Test1Plus {
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
//            if (seat == 0) {
//                ticket = (int) (ticket * 0.85);
//            } else if (seat == 1) {
//                ticket = (int) (ticket * 0.9);
//            } else {
//                System.out.println("对不起，您输入的舱位信息不合法");
//            }
            ticket = getprice(ticket, seat, 0.85, 0.9);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            //再继续判断是头等舱还是经济舱
//            if (seat == 0) {
//                ticket = (int) (ticket * 0.65);
//            } else if (seat == 1) {
//                ticket = (int) (ticket * 0.7);
//            } else {
//                System.out.println("对不起，您输入的舱位信息不合法");
//            }
            ticket = getprice(ticket, seat, 0.65, 0.7);
        } else {
            System.out.println("对不起，您输入的月份信息不合法");
        }
        //输出票价
        System.out.println("您的机票价格是:" + ticket);
    }

    //我要干什么
    //我需要哪些东西
    //是否需要返回值
    public static int getprice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("对不起，您输入的舱位信息不合法");
        }
        return ticket;
    }
}

