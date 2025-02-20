package ProcessControl;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
        根据不同的分数确定礼物的种类
        95-100 送iPhone 16ProMax国行1TB一部
        90-94  送iPad Air6国行512GB
        85-89  送国行airpods4
        80-84  送迪士尼门票一张
        79及一下 滚蛋 去你妈的
         */
        //输入所得分数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的分数：");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送iPhone 16ProMax国行1TB一部");
            } else if (score >= 90 && score <= 94) {
                System.out.println("送iPad Air6国行512GB");
            } else if (score >= 85 && score <= 89) {
                System.out.println("送国行airpods4");
            } else if (score >= 80 && score <= 84) {
                System.out.println("送迪士尼门票一张");
            } else {
                System.out.println("SB 去你妈的");
            }
        } else {
            System.out.println("请输入合法数据");
        }

    }
}
