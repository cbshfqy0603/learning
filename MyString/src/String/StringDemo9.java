package String;

import java.util.Scanner;

/*
字符串的截取：
String substring(int beginIndex, int endIndex);
注意点：包头不包未 包左不包右 只有返回值才是截取的小串 （字符串一经创建 就不再改变）
String substring(int beginIndex);
注意点：从给出的起始位置一直截取到末尾 只有返回值才是截取的小段
 */
public class StringDemo9 {
    public static void main(String[] args) {
        //获取一个手机号
        System.out.println("请输入您的手机号码：");
        Scanner sc = new Scanner(System.in);
        String phoneNumber = null;
        while (true) {
            phoneNumber = sc.next();
            boolean flag = judgePhoneNumber(phoneNumber);
            if (flag) {
                break;
            } else {
                System.out.println("对不起，您输入得手机号不合法，请重新输入");
            }
        }
        //获取手机号的前3位
        //从第一个元素开始（索引为0）到最第三个元素介素结束（索引为2）
        //but substring(int beginIndex, int ensIndex)在进行字符串的截取时包头不包尾
        //所以最后一个索引得 + 1
        String start = phoneNumber.substring(0, 3);
        //System.out.println(start);
        //获取手机号的后四位
        //11位手机号 11 - 3 = 8（包括第一个数）又因为是索引 - 1 -> 7
        String end = phoneNumber.substring(7);//只给开始索引直接截取到末尾
        //System.out.println(end);
        //将字符串进行拼接
        String result = start + "****" + end;
        //打印结果
        System.out.println(result);
    }
    //定义一个函数，用于判断输入的手机号是否合法
    //我要做什么 --= 判断手机号是否合法
    //我做这件事需要什么 --- 需要用到手机号
    //是否需要给方法调用处提供返回值 ---  需要（boolean）
    public static boolean judgePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        } else {
            return true;
        }
    }
}
