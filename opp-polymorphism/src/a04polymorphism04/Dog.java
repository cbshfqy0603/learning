package a04polymorphism04;

public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱着" +
        food + "猛吃");
    }
}
