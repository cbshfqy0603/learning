package test4;
/*
构造方法概述：
创建对对象的时候，虚拟机会自动调用构造方法，作用是给成员变量进行初始化的
构造方法特点：
（1）方法名与类名相同，大小也一致
（2）没有返回值类型，连void也没有
（3）没有具体的返回值
 构造方法的执行时机：
（1）创建对象的时候由虚拟机调用，不能手动调用构造方法
（2）每创建一次对象，都会调用一次构造方法
 */
public class Student {
    private String name;
    private int age;
    //空参构造
    /*
    如果我们没有写任何构造方法
    那么虚拟机会自动给我们加一个空参构造
     */
    public Student() {
        System.out.println("来看看我执行了没");
    }
    //带参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
