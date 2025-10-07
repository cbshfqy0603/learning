package a01polymorphism01;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生的姓名为" + getName() + ", " + "年龄为：" + getAge());
    }
}
