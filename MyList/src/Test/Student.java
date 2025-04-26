package Test;

public class Student {
    //一个标准的javaBean类
    //私有成员变量
    //空参构造
    //带全部参数的构造
    //每个成员变量对应的get()和set()方法
    private String id;
    private String name;

    public Student() {

    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
