package a04polymorphism04;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String food) {
//        if (a instanceof Dog d) {
//            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" +  d.getColor() + "颜色的"+d.getAge()+"岁的狗");
//            d.eat(food);
//        } else if (a instanceof Cat c) {
//            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getColor() + "颜色的"+c.getAge()+"岁的猫");
//            c.eat(food);
//        } else {
//            System.out.println("tmd，老子不养这玩意啊");
//        }
        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" +  a.getColor() + "颜色的"+a.getAge()+"岁的狗");
        a.eat(food);
    }
}
