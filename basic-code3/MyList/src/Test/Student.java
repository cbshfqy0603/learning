package Test;

public class Student {
    //一个标准的javaBean类
    //私有成员变量
    //空参构造
    //带全部参数的构造
    //每个成员变量对应的get()和set()方法;
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
