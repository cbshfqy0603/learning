package a03mystatic;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        //定义一个数组用于存储学生信息
        ArrayList<Student> list = new ArrayList<>();
        //创建三个学生对象
        Student stu1 = new Student("张三", 19, "男");
        Student stu2 = new Student("李四", 23, "男");
        Student stu3 = new Student("王五", 20, "男");
        //将三个对象存入集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //调用工具类中的静态方法
        System.out.println("最大的学生年龄为" + StudentUtil.getMaxStudentAge(list));
    }
}
