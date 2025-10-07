package com.hunan.demo2;

import com.hunan.demo1.Animal;

public class Dog extends Animal {
    public void show01() {
        System.out.println(super.name);
        super.show();
    }
}
