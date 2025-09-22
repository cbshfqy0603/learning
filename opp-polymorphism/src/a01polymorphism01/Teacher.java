package a01polymorphism01;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的姓名为" + getName() + ", " + "年龄为：" + getAge());
    }
}
