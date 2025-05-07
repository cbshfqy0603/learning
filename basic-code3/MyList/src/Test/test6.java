package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //需求；
        //（1）main方法中定义一个集合，存入三个用户对象。
        //用户属性为：id, username, password
        //（2）要求：定义一个方法，根据id查找对应的用户信息
        //如果存在返回true
        //如果不存在，返回flase
        //创建ArrayList集合
        ArrayList<User> list = new ArrayList<>();
        //创建三个User对象
        User user1 = new User("001", "张三", "123456");
        User user2 = new User("002", "李四", "12345678");
        User user3 = new User("003", "王五", "123456qwer");
        //将三个user对象存储在列表中
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //调用contains方法进行判断
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行判断的id:");
        String id = sc.next();
        boolean flag = contains(list, id);
        if (flag) {
            System.out.println(id + "所对应的对象存在");
        } else {
            System.out.println(id + "所对应的对象不存在");
        }

    }
    //我要干什么 根据id判断对象是否在列表中
    //我需要什么 需要list id(需要进行匹配的id)
    //方法调用处是否需要返回值 boolean
    //结合test7进行修改优化
    public static boolean contains(ArrayList<User> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            User user = list.get(i);
//            String uid = user.getId();
//            if (uid.equals(id)) {
//                return true;
//            }
//        }
//        return false;
        if (getIndex(list, id) >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uid = user.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
