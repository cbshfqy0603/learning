package String;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母，小写字母字符，数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //统计 --- 计数器思想
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //str.length().fori
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                //char类型的数据在进行计算的时候会自动提升为int类型---查询ASCII码
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                //注意此处绝对不能写成0和9 必须写成'0'和'9'
                // --- 具体原因就是因为是ASCII码值的比较
                //ASCII码为0时对应的字符为特殊字符 ASCII码为48时对应的字符才是'0'
                numberCount++;
            }
        }
        System.out.println("大写字母的个数为：" + bigCount);
        System.out.println("小写字母的个数为：" + smallCount);
        System.out.println("数字字符的个数为：" + numberCount);
    }
}
