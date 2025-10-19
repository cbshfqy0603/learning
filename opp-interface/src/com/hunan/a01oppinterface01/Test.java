package com.hunan.a01oppinterface01;

public class Test {
    public static void main(String[] args) {
        //创建青蛙对象
        Frog f = new Frog("小青", 1);
        System.out.println(f.getName() + ",  "  + f.getAge());
        f.eat();
        f.swim();
        //创建兔子对象
        Rabbit r = new Rabbit("小白", 2);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();//兔子类没有实现游泳接口 故兔子类没有游泳方法
    }
}
