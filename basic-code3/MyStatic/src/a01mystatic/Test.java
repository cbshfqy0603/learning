package a01mystatic;

public class Test {
    public static void main(String[] args) {
        //利用类名来调用静态变量（静态变量属于类而不属于对象，同时随着类的加载而加载，优先于对象）
        Student.teacherName = "🐎老师";
        //创建第一个学生对象
        Student s1 = new Student();
        //利用对象来调用静态变量
        //s1.teacherName = "🐎老师";（不推荐，语法正确，但是不符合逻辑，静态变量属于类不属于对象）
        //调用Set()方法为对象属性赋值
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //调用show()方法
        s1.show();

        //创建第二个学生对象
        Student s2 = new Student();
        s2.setName("张美丽");
        s2.setAge(21);
        s2.setGender("女");
        //调用show()方法
        s2.show();


    }
}
