package a04polymorphism04;

public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧这个头吃" +
                food);
    }
}
