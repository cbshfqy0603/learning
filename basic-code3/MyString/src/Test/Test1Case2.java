package Test;

import java.util.Scanner;

/*
需求：转换罗马数字
键盘录入一个字符串，
要求：（1）长度小于等于9 （2）只能是数字
将内容变成罗马数字 下面是阿拉伯数字跟罗马数字的对比关系：
Ⅰ - 1 Ⅱ - 2 Ⅲ -3 Ⅳ - 4 Ⅴ - 5 Ⅵ - 6 Ⅶ - 7 Ⅷ - 8 Ⅸ - 9
注意点罗马数字里面是没有0的 如果键盘录入的数字里面包含0，可以变成" "
 */
public class Test1Case2 {
    public static void main(String[] args) {
        //键盘录入数字字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字字符串：");
        //此处一定要把str定义为全局变量
        String str = "";
        while (true) {
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("您输入的字符串不符合规则，请重新输入：");
            }
        }
        //调用转化方法并拼接
        //多次拼接 使用StringBuilder或者StringJoiner
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //利用switch就不需要把字符数字转换为int型数字
            //int number = c - '0';//可以减 '0' 也可以减 48
            //System.out.println(number);
            sb.append(numberToRoma(c)).append(" ");
        }
        //将StringBuilder对象转换为String
        String result = sb.toString();
        //打印最终结果
        System.out.println(result);
    }

    //使用switch
    //定义一个方法将对应数字转换为罗马数字
    public static String numberToRoma(char number) {
        //Ⅰ - 1 Ⅱ - 2 Ⅲ -3 Ⅳ - 4 Ⅴ - 5 Ⅵ - 6 Ⅶ - 7 Ⅷ - 8 Ⅸ - 9
        String str = "";
        switch (number) {
            case '0' -> str = " ";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
        }
        return str;
    }

    //定义一个方法用于判断用户从键盘录入的字符串是否满足规则
    public static boolean checkStr(String str) {
        //是否满足要求1
        if (str.length() > 9) {
            return false;
        }
        //是否满足要求2
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

