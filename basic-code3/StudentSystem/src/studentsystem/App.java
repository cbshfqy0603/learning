package studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统登录界面");
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
    //登录
    public static void login(ArrayList<User> list) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            //用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
            if (!(contains(list, username))) {
                System.out.println("用户名" + username + "未注册，请先注册");
                return;
            }
            System.out.println("请输入密码：");
            String password = sc.next();
            //验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("验证码为：" + rightCode);
                System.out.println("请输入验证码：");
                String code = sc.next();
                if (!(rightCode.equalsIgnoreCase(code))) {
                    System.out.println("验证码输入错误，请重新输入");
                } else {
                    System.out.println("验证码输入正确");
                    break;
                }
            }
            //判断用户名和密码是否正确
            int index = getIndex(list, username);
            User user = list.get(index);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("登录成功，可以开始使用学生管理系统了");
                StudentSystemDemo ssd = new StudentSystemDemo();
                ssd.studentSystem();
                break;
            } else {
                System.out.println("登录失败，用户名或者密码错误");
                if (i == 2) {
                    System.out.println("账号" + username + "已被锁定，请即使联系客服进行处理");
                } else {
                    System.out.println("您还剩下" + (2 - i) + "次输入机会");
                }
            }
        }
    }
    //注册
    public static void register(ArrayList<User> list) {
        //用户名需要满足以下要求：
        //（1）用户名唯一（最后进行，因为以后的数据都存储在数据库中，如果我们需要进行校验，需要用用到网路资源）
        //（2）用户长度必须在3-15位之间
        //（3）只能是字母加数字的组合，但不能是纯数字
        //键盘录入用户名
        //开发细节：先验证格式是否正确，在进行唯一性判断
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            //调用checkUsername()方法来判断用户名格式是否满足要求
            if (checkUsername(username)) {
                System.out.println("用户名格式正确");
            } else {
                System.out.println("用户名格式不正确，请重新输入");
                //此处一定要有continue 不然后面的代码会继续执行
                continue;
            }
            //对用户名进行唯一性判断唯一性判断
            if (contains(list, username)) {
                System.out.println("用户名" + username + "已被注册，请重新输入");
            } else {
                System.out.println("用户名" + username+ "可用");
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
        while (true) {
            System.out.println("请输入您的身份证号：");
            personId = sc.next();
            if (checkPersonId(personId)) {
                System.out.println("身份证号满足要求");
                break;
            } else {
                System.out.println("身份证号格式有误，请重新输入");
            }
        }
        //手机号需满足以下要求：
        //长度为11位
        //不能以0开头
        //必须都是数字
        //键盘录入手机号
        String phoneNumber;
        while (true) {
            System.out.println("请输入您的手机号：");
            phoneNumber = sc.next();
            if (checkPhoneNumber(phoneNumber)) {
                System.out.println("手机号码满足要求");
                break;
            } else {
                System.out.println("手机号码格式有误，请重新输入");
            }
        }
        //代码执行到此处，证明用户名，密码，身份证号，手机号全都满足要求
        //创建User对象同时利用带全部参数的构造方法给user对象的成员属性赋值
        User user = new User(username, password, personId, phoneNumber);
        //将user对象添加进list列表
        list.add(user);
    }
    //忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        if (!(contains(list, username))) {
            System.out.println("用户名" + username + "未注册，请先注册");
            //直接结束方法
            return;
        }
        //键盘录入身份证号码和手机号码
        System.out.println("请输入您的身份证号码：");
        String personId = sc.next();
        System.out.println("请输入您的手机号码：");
        String phoneNumber = sc.next();

        //判断身份证号与手机号码是否一致
        int index = getIndex(list, username);
        User user = list.get(index);
        if (!(user.getPersonId().equalsIgnoreCase(personId) && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("账号信息不匹配，修改失败");
            return;
        }
        //代码执行到此处证明身份证号和手机号码一致，进行修改密码操作
        while (true) {
            System.out.println("请输入要修改的密码：");
            String password = sc.next();
            System.out.println("请再次输入要修改的密码：");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("密码修改成功！");
                user.setPassword(password);
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入密码");
            }
        }

    }
    //验证用户名格式是否正确
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
    //验证身份证号格式是否正确
    public static boolean checkPersonId(String personId) {
        //（3）前17位，必须都是数字
        //（4）最后一位可以是数字，也可以是大写或者小写
        //长度为18位
        if (personId.length() != 18) {
            return false;
        }
        //不能以0开头
        if (personId.startsWith("0")) {
            return false;
        }
        //前17位都是数字
        for (int i = 0; i < personId.length() - 1; i++) {
            char c = personId.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //最后一位可以是数字，也可以是大写X或者小写x
        char endChar = personId.charAt(personId.length() -1);
        if ((endChar >= '0' && endChar <= '9') || endChar == 'X' || endChar == 'x') {
            return true;
        } else {
            return false;
        }

    }
    //验证手机号格式是否正确
    private static boolean checkPhoneNumber(String phoneNumber) {
        //手机号需满足以下要求：
        //键盘录入手机号
        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0开头
        //startsWith() -> 注意此处括号里面输入的应是字符串类型的0 而不是字符0
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //代码执行到此处，证明前面的要求都满足 返回true即可
        return true;
    }
    //对用户名进行唯一性判断
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
    //获取对应用户对象的索引
    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }
    //生成验证码
    public static String getCode() {
        //验证码规则：
        //（1）长度为5
        //（2）由四位大写或者小写字母和一位数字组成，同一个字母可重复
        //（3）数字可以出现在任意位置
        //创建ArrayList集合
        //（回忆:ArrayList可以直接存储引用数据类型 但是基本数据类型必须将其转化为包装类才能能存储）
        ArrayList<Character> list = new ArrayList<>();
        //利用集合存储26个小写字母和大写字母
        for (int i = 0; i < 26; i++) {
            //存储大写字母
            list.add((char)('A' + i));
            //存储小写字母
            list.add((char)('a' + i));
        }
        //随机抽取4个字母
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(list.size());
            sb.append(list.get(randomIndex));
        }
        //随机抽取一个数字拼接在尾部
        int randomNumber = r.nextInt(10);
        sb.append(randomNumber);
        //将数字的位置进行随机调换
        //回忆：要对字符串内容进行修改：
        //（1）对字符串进行截取 （2）将字符串转换为字符数组
        char[] chs = sb.toString().toCharArray();
        int randomIndex = r.nextInt(chs.length);
        char temp = chs[randomIndex];
        chs[randomIndex] = chs[chs.length - 1];
        chs[chs.length - 1] = temp;
        return new String(chs);
    }

}

