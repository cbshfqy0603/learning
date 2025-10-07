package a04polymorphism04;

public class Test {
    public static void main(String[] args) {
        //第一个饲养员
        Person p1 = new Person("老王", 30);
        Dog d = new Dog(2, "黑");
        p1.keepPet(d, "骨头");
        //第二个饲养员
        Person p2 = new Person("老李", 25);
        Cat c = new Cat(3, "灰");
        Dog d2 = new Dog(1, "黄");
        p2.keepPet(c, "鱼");
        p1.keepPet(d2, "狗饲料");

    }
}
