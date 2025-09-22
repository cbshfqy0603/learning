package a01polymorphism01;
//什么是多态 对象的多种形态
//多态的前提
//（1）有继承/实现（接口）
//（2）有父类应用指向子类对象  父类类型 对象名称 = 子类对象
//（3）有方法重写
//多态的好处
//使用父类作为参数，可以接受所有子类对象
//体现堕胎的扩展性与便利性
public class Test {
    public static void main(String[] args) {
        //分别创建学生 老师 管理员 三个对象
        Student s = new Student();
        s.setName("李四");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王五");
        t.setAge(25);

        Administrator a = new Administrator();
        a.setName("赵六");
        a.setAge(26);

        //调用register方法
        register(s);
        register(t);
        register(a);
    }

    //这个方法既能接受老师，学生，还能接受管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
