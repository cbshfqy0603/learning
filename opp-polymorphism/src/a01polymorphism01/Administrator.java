package a01polymorphism01;

public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的姓名为" + getName() + ", " + "年龄为：" + getAge());
    }
}
