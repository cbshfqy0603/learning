package ao3polymorphism03;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();//狗吃骨头
        Dog d = (Dog) a;
        d.lookHome();//狗看家
    }
}

class Animal {
    public void eat() {
        System.out.println("动物在吃饭");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}