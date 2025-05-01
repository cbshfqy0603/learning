package Test;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        //定义一个集合，添加一些学生对象，并进行遍历
        //学生类的属性为：姓名，年龄
        //创建一个ArrayList集合
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 26);
        //将学生对象添加进列表
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历列表
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("学生姓名:" + stu.getName() + "  " +
                    "学生年龄:" + stu.getAge());
        }
    }
}
