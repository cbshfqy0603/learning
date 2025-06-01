package StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //已知正确的用户名和密码，请用程序实现模拟用户登录
        //总共三次机会，登录之后，给出相应的提示
        //定义两个变量来记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        for (int i = 0; i < 3; i++) { //i 0 1 2
            //键盘录入用户名和密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            //将键盘录入的用户名和密码和事先存储的用户名和密码进行比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("连续输入错误超过3次，您的账户已被锁定，如要" +
                            "解除锁定，请联系官方客服");
                } else {
                    System.out.println("登录失败，用户名或者密码有误");
                    System.out.println("你还剩下" + (2 - i) + "次机会");//2 1 0
                }
            }
        }

    }
}
