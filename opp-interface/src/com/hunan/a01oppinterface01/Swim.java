package com.hunan.a01oppinterface01;
//接口的定义和使用
//接口用关键字interface来定义 public interface 接口名 {}
//接口不能实例化
//接口和类之间是实现关系，通过implements关键字表示 public class 类名 implements 接口名 {}
//接口的子类（实现类） 要么重写接口中的所有抽象方法 要么是抽象类
//注意1：接口和类的实现关系，可以单实现，也可以多实现
//public class 类名 implements 接口1, 接口2 {}
//注意2：实现类还可以在继承一个类的同时实现多个接口
//public class 类名 extends 父类 implements 接口名1, 接口名2 {}
public interface Swim {
    public abstract void swim();
}
