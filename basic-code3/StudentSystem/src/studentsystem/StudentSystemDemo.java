package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

//需求：采用控制台的方式去书写学生管理系统
public class StudentSystemDemo {
    public static void main(String[] args) {
        //创建列表集合
        ArrayList<Student> list = new ArrayList<>();
        //快捷键：ctrl + alt + t
        loop : while (true) {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出系统");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch(choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出系统");
                    //方法1：此处直接用break退出的话，只能退出内层的switch语句，
                    //要是想要直接结束循环，可以将外层的while循环命名为loop，
                    //直接break loop即可
                    //break loop;
                    //方法二：直接停止虚拟机运行 System.exit(0);
                    System.exit(0);
                }
                default -> System.out.println("该选项不存在");
            }
        }
    }
    //增加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //输入学生id
        String id = null;
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("学生id已经存在，请重新输入");
            } else {
               break;
            }
        }
        //输入学生姓名
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        //输入学生年龄
        System.out.println("请输入学生年龄：" );
        int age = sc.nextInt();
        //输入学生家庭地址
        System.out.println("请输入学生家庭住址：");
        String address = sc.next();
        //利用构造方法给对象成员变量赋值
        Student stu = new Student(id, name, age, address);
        //将对象添加进列表
        list.add(stu);

    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            //如果删除学生不存在，提示删除失败
            System.out.println("当前学生不存在，删除失败");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        Student stu = list.get(index);
        //输入学生姓名
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        stu.setName(name);
        //输入学生年龄
        System.out.println("请输入学生年龄：" );
        int age = sc.nextInt();
        stu.setAge(age);
        //输入学生家庭地址
        System.out.println("请输入学生家庭住址：");
        String address = sc.next();
        stu.setAddress(address);
    }
    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        //如果没有学生信息，提示：当前无学生信息，请添加后查询
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        //输出第一栏
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" +
                    stu.getAge() + "\t" + stu.getAddress());
        }
    }
    //id唯一性判断(id是否在列表中存在)
    public static boolean contains(ArrayList<Student> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            String uid = stu.getId();
//            if (uid.equals(id)) {
//                return true;
//            }
//        }
//        return false;
        //利用getIndex方法来判断对象在列表中是否存在
        if (getIndex(list, id) >= 0) {
            return true;
        } else {
            return false;
        }
    }
    //获取id对应学生对象的在列表中的索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String uid = stu.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}