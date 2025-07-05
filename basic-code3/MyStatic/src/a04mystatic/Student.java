package a04mystatic;
//static的注意事项：
//（1）静态方法只能访问静态变量和静态方法
//（2）非静态方法可以访问静态变量或者静态方法，也可以访问非静态的成员变量和非静态的成员方法
//（3）静态方法中是没有this关键字的（非静态方法中有this关键字）
//总结：（1）静态方法中，只能访问静态 （2）非静态方法可以访问所有 （3）静态方法中没有静态关键字
public class Student {
    String name;
    int age;
    static String teacherName;

    public void show() {
        //...略
    }
}
