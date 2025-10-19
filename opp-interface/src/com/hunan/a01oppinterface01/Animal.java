package com.hunan.a01oppinterface01;
//青蛙
//属性：名字，年龄
//行为：吃虫子，蛙泳
//狗
//属性：名字，年龄
//行为：吃骨头，狗刨
//兔子
//属性：名字，年龄
//行为：吃胡萝卜
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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
    public abstract void eat();
}
