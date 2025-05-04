package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        //需求；test6变种
        //（1）main方法中定义一个集合，存入三个用户对象。
        //用户属性为：id, username, password
        //（2）要求：定义一个方法，根据id查找对应的用户信息
        //如果存在返回对应的索引值
        //如果不存在，返回-1（不管是数组还是列表 都不存在-1索引）
        //创建ArrayList<>列表
        ArrayList<User> list = new ArrayList<>();
        //创建三个User对象
        User user1 = new User("001", "张三", "123456");
        User user2 = new User("002", "李四", "12345678");
        User user3 = new User("003", "王五", "123456qwer");
        //将三个user对象存储在列表中
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //调用getIndex方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行判断的id:");
        String id = sc.next();
        int Index = getIndex(list, id);
        if (Index >= 0) {
            System.out.println("与" + id + "相匹配的学生为:");
            User user = list.get(Index);
            System.out.println(user.getUsername());
        } else {
            System.out.println("对不起，该id对应的用户不存在");
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
