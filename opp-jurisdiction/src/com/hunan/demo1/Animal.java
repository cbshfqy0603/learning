package com.hunan.demo1;
//修饰符   同一个类中   同一个包其他类 不同包下的子类 不同包下的无关类
//private     √
//空着不写     √          √
//protected   √          √              √
//public      √          √              √            √
//权限修饰符的使用规则：
//（1）实际开发中，一般只用private和public
//（2）成员变量私有 方法公开
//特例：如果方式中的代码是抽取其他方法中共性代码，这个方法一般也私有
public class Animal {
    //private String name;//private
    //String name;//空着不写
    protected String name;//protected
    //public String name;//public
    public void show() {
        System.out.println(name);
    }

}
