package a02polymorphism02;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //调用成员变量： 编译看左边，运行也看左边
        //编译看左边：Javac编译编译编代码的时候，会看左边的父类有没有这个变量，如果有，编译成功，如果没有编译失败
        //运行也看左边：Java运行代码的时候，实际获取的就是左边父类中成员变量的值
        System.out.println(a.name);//动物
        //调用成员方法： 编译看左边，运行也看右边
        //编译看左边：Javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功，如果没有编译失败
        //运行看右边：Java运行代码的时候，实际上运行的是子类中的方法
        a.show();//Dog---show
        //成员变量：在子类中的对象中，会把父类的成员变量也继承下的 父：name 子：name
        //成员方法：如果子类对方法进行了重写，那么在虚方法中实惠把父类的方法进行覆盖的
    }
}

class Animal {
    String name = "动物";
    public void show() {
        System.out.println("Animal---show");
    }
}
class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog---show");
    }
}
class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat---show");
    }
}