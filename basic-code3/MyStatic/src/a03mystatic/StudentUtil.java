package a03mystatic;

import java.util.ArrayList;

public class StudentUtil {
    //定义一个工具类，用于获取集合中最大的学生年龄
    //私有化构造方法
    private StudentUtil() {
    }

    public static int getMaxStudentAge(ArrayList<Student> list) {
        //定义一个参照物
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge > max) {
                max = tempAge;
            }
        }
        return max;
    }
}
