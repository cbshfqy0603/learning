package a04polymorphism04;

public class Test {
    public static void main(String[] args) {
        //第一个人
        Person p1 = new Person("老王", 30);
        Dog d = new Dog(2, "黑");
        p1.keepPet(d, "骨头");
        //第二个人
        Person p2 = new Person("老李", 25);
        Cat c = new Cat(3, "灰");
        p1.keepPet(d, "鱼");

    }
}
