package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("4：退出");
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void login(ArrayList<User> list) {
        System.out.println("登录");
    }

    public static void register(ArrayList<User> list) {
        //用户名需要满足以下要求：
        //（1）用户名唯一（最后进行，因为以后的数据都存储在数据库中，如果我们需要进行校验，需要用用到网路资源）
        //（2）用户长度必须在3-15位之间
        //（3）只能是字母加数字的组合，但不能是纯数字
        //键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            //唯一性判断
            boolean flag1 = contains(list, username);
            if (flag1) {
                System.out.println("该用户名已被注册，请重新输入");
                continue;
            }
            //调用checkUsername()方法来判断用户名是否满足要求
            boolean flag2 = checkUsername(username);
            if (!flag2) {
                System.out.println("用户名不可用，请重新输入");
            } else {
                System.out.println("用户名可用");
                break;
            }
        }
        //键盘录入密码
        String password, againPassword;
        while (true) {
            System.out.println("请输入密码：");
            password = sc.next();
            System.out.println("请再次输入密码：");
            againPassword = sc.next();
            if (password.equals(againPassword)) {
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入密码");
            }
        }
        //身份证号需要满足以下要求；
        //（1）长度为18位
        //（2）不能以0为开头
        //（3）前17位，必须都是数字
        //（4）最后一位可以是数字，也可以是大写或者小写
        //键盘录入身份证号
        String personId;
        System.out.println("请输入您的身份证号：");
        personId = sc.next();
        checkPersonId(personId);

    }


    public static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }

    public static boolean checkUsername(String username) {
        //用户名长度必须在3-15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //第一部分：只能是字母加数字的组合（要求三拆成两个部分）
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            //大写字母 小写字母 数字 三者满足其中一个即可
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                //三个条件都不满足
                return false;
            }
        }
        //代码执行到这个部分，表示该用户名满足用户长度和字母加数字组合这两个要求
        //第二部分；不是纯数字
        //计数器思想：
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                //优化：此处的计数并不是要统计用户名中字母的个数，
                //而是只要有字母的存在就表示该用户名符合要求
                count++;
                break;
            }
        }
        //此处尽量不要用if else 直接用return即可
        return count > 0;
    }

    public static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uName = user.getUsername();
            if (uName.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPersonId(String personId) {
        //（2）不能以0为开头
        //（3）前17位，必须都是数字
        //（4）最后一位可以是数字，也可以是大写或者小写
        //长度为18位
        if (personId.length() != 18) {
            return false;
        }
        //不能以0开头
        personId.startsWith();

    }
}
