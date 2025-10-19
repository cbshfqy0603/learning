package com.hunan.a02oppinterface02;
//接口中成员的特点：
//成员变量： 只能是常量 默认修饰符：public static final
//构造方法： 没有
//成员方法： 只能是抽象方法（JDK7之前） 默认修饰符：public abstract
public interface Inter {
    //int a = 10; -> 默认 public static final int a = 10;
    public static final int a = 10;//常量

    //void method(); -> 默认 public abstract void method();
    public abstract void method();
    //JDk7以前：接口中只能定义抽象方法
    //JDK8的新特性：接口中可以定义有方法体的方法
    //JDK9的新特性：接口中可以定义私有方法（后面两点暂时忽略）
}
