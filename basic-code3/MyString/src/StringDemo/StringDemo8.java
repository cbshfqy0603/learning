package StringDemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //金额转换
        Scanner sc = new Scanner(System.in);
        //快捷键：ctrl + alt + t
        //输入金额，并判断金额数值是否是在合法的范围内
        //把money定义成全局变量，不然随着循环的结束，变量会自动出栈
        int money = 0;
        while (true) {
            System.out.println("请输入你的存款金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额不合法");
            }
        }
        String moneyStr = "";
        while(money != 0) { //2345
            //获取个位
            int ge = money % 10;
            //把获取的个位转成汉字
            String str = getCapitalNumber(ge);
            //注意此处等号右边必须是这个顺序，如果变为：
            //moneyStr = moneyStr + str; 假如我输入的是2345 输出的是伍肆叁贰
            //第一次循环："伍"
            //第二次循环："肆" + "伍" = "肆伍"
            //......
            moneyStr = str + moneyStr;
            money = money / 10;
        }
        System.out.println(moneyStr);
        //已经把数字金额转换为汉字金额 现在需要在高位补“零”
        //定义一个变量用于计算还需要补几个"零"
        //此处上限就是7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);
        //定义一个数组用来存储单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }
    //定义一个方法把数字金额转换成汉字金额
    //我要干什么 --- 把数字金额转换成汉字金额
    //我需要什么 --- 需要数字
    //是否需要返回值到方法调用处 --- 必须需要
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
