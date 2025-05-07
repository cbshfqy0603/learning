package Test;

public class Test5 {
    public static void main(String[] args) {
        /*
        给定两个字符串形式表示的非负整数num1和num2,返回num1和num2的乘积，它们的乘积也表示为字符串形式
        注意：需要用已有知识完成
         */
        //定义两个字符串类型的非负整数
        String num1 = "999";
        String num2 = "20";
        //将两个字符串类型的非负整数转换为整数
        int number1 = StringToInt(num1);
        int number2 = StringToInt(num2);
//        System.out.println(number1);
//        System.out.println(number2);
        //转换为整数后相乘
        int result = number1 * number2;
        //把乘积转换为字符串类型
        String str = result + "";
        //打印最终的结果
        System.out.println(str);
    }
    //我要干什么 把数字字符转换为数字
    //我需要什么 我需要数字字符
    //方法调用处是否需要返回值 需要返回转换后的数字
    public static int StringToInt(String str) {
        char[] chs = str.toCharArray();
        int result = 0;
        for (int i = 0; i < chs.length; i++) {
            int number = chs[i] - '0';
            result = result * 10 + number;
        }
        return result;
    }
}
