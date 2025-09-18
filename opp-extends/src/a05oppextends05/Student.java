package a05oppextends05;
//this super使用总结
//（1）this: 理解为一个变量，表示当前方法调用者的地址值
//（2）super: 代表父类存储空间
//关键字       访问成员变量      访问成员方法      访问构造方法
//this         this.成员变量    this.成员方法       this()
//              访问本类成员变量 访问本类成员方法       访问本类构造方法
//super        super.成员变量    super.成员方法       super()
//            访问父类成员变量   访问父类成员方法       访问父类构造方法
public class Student {
    String name;
    int age;
    String school;

    //现有一需求：如果没填学校 默认家里蹲大学
    public Student() {
        //使用this调用本类其他的构造方法
        this(null, 0, "家里蹲大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
