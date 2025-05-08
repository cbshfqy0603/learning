package a01mystatic;

public class Student {
    //姓名 年龄 性别
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {

    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public void set(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    //学习
    public void study() {
        System.out.println(name + "在学习");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender);
    }

}
