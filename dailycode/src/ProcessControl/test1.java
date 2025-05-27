package ProcessControl;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*在实际开发中，电影院选座也会用到if判断
        某家电影院售卖了100张票，序号为1-100
        如果序号为奇数坐在电影院的左边，偶相反      */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的电影序号:");
        int ticket = sc.nextInt();
        if (ticket > 0 && ticket <= 100) {
            //判断是坐在左边还是右边
            if (ticket % 2 == 1) {
                System.out.println("你的座位在左侧");
            } else {
                System.out.println("你的座位在右侧");
            }
        } else {
            System.out.println("sb,你他妈的走错电影院了");
        }
    }
}
