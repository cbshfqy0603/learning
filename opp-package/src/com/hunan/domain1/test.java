package com.hunan.domain1;

import com.hunan.domain2.Teacher;

public class test {
    public static void main(String[] args) {
        //使用同一个包中的类时，不需要导包
        Student s = new Student();
        s.setAge(19);
        s.setName("张三");
        System.out.println(s.getAge() + ", " + s.getName());

        //使用java.lang包中的类中，不需要导包
        String b = "abc";
        System.out.println(b);

        //其他情况都需要导包
        Teacher t = new Teacher();
        t.setAge(35);
        t.setName("李四");
        System.out.println(t.getAge() + ", " + t.getName());

        //如果同时使用两个包中的同名类，需要用全类名
        com.hunan.domain3.Teacher t1 = new com.hunan.domain3.Teacher();
        t1.setAge(38);
        t1.setName("孙红雷");
        System.out.println(t1.getAge() + ", " + t1.getName());
    }
}
