package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //定义一个集合，添加一些学生对象，并进行遍历
        //学生类的属性为；姓名，年龄
        //要求；对象的属性来自键盘录入
        //创建一个ArrayList集合对象
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象并为学生对象相关属性复制，同时将其添加进列表
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            //将姓名和年龄赋值给学生对象
            stu.setName(name);
            stu.setAge(age);
            //将学生对象添加进列表
            list.add(stu);
        }
        //System.out.println(list);输出结果为各自学生对象的地址值，结果用[]包裹
        //遍历列表
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("学生姓名：" + stu.getName() + "    "
                    + "学生年龄：" + stu.getAge());
        }
    }
}
