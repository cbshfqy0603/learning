package a04oppextends04;
//继承中构造方法的访问特点是什么？
//（1）子类不能继承父类的构造方法，但是可以通过super调用
//（2）子类构造方法的第一行，有一个默认的super();
//（3）默认先访问父类无参的构造方法，再执行自己
//（4）如果想要调用父类有参构造，必须手写书写
public class Student extends Person {
    public Student() {
        //子类的构造方法隐藏super()去调用父类的构造方法
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name, int age) {
        //调用父类的有参构造，必须手写super调用
        super(name, age);
    }
}
