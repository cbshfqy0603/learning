package test4;

public class StudentTest {
    public static void main(String[] args) {
        //括号里面没有东西 调用的是空参构造
        Student s1 = new Student();
        System.out.println(s1);//地址值
        //括号里面有东西 调用的是带参构造
        Student s2 = new Student("张三", 19);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        /*
        构造方法注意事项：
        （1）构造方法的定义：
        ->如果没有定义构造方法，系统将给出一个默认的不带参数的构造方法
        ->如果已经定义了构造方法，系统将不再提供默认的不带参数的构造方法
        （2）构造方法的重载：
        ->带参的构造方法和不带参的构造方法，两者方法名相同，但是参数不同，这叫作构造方法的重载
        （3）推荐的使用方式：
        无论是否使用，都手动书写带参数的构造方法和不带参数的构造方法
         */
    }
}
