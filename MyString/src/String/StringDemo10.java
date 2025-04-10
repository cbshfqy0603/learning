package String;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        //需求：输入18位身份证号码，来获取对应的出生年月日和性别
        //7-14位 出生年月日 倒数第二位：为奇数 - 男 为偶数 - 女
        //输入18位身份证号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号：");
        String id = "";
        while (true) {
            id = sc.next();
            if (judgeId(id)) {
                break;
            } else {
                System.out.println("您输入的身份证号有误，请重新输入");
            }
        }
        //通过身份证号获取出生年月日
        //7-10位：年 11-12；月 13-14：日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
        System.out.println("出生年月日为：" + year + "年" +
                month + "月" + day + "日");
        //根据身份证号倒数第二位来判断具体性别
        //小tips:如果没有对ASCII码表进行具体记忆，可以通过输出语句来求ASCII码值
        //System.out.println(0 + '0');  //48    '0' -> 48
        //'0' -> 48 -> '0' - 48 == 0
        //'1' -> 49 -> '1' - 48 == 1
        //......
        //'9' -> 57 -> '9' - 48 == 9
        //获取身份证号的倒数第二位
        char c = id.charAt(16);
        //通过倒数第二位来对性别进行判断
        int number = c - 48;
        if (number % 2 != 0) {
            System.out.println("性别为：" + "男");
        } else {
            System.out.println("性别为：" + "女");
        }

    }
    //定义一个函数来判断用户输入得身份证号是否合法
    public static boolean judgeId(String id) {
        if (id.length() != 18) {
            return false;
        }
        return true;
    }
}
