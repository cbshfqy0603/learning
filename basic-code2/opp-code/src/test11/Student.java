package test11;

public class Student {
    //学生的属性：学号，姓名，年龄
    //目前对于字符串的判断和比较并无学习 所以目前学生id暂时使用int类型
    private int id;
    private String name;
    private int age;

    public Student() {

    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
