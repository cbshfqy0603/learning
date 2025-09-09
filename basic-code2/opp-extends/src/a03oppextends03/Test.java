package a03oppextends03;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭");
    }
    public void drink() {
        System.out.println("喝茶");
    }
}


class Student extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
}