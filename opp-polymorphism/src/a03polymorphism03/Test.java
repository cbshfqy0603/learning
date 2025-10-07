package a03polymorphism03;
//多态的优势是什么？
//方法中，使用父类型作为参数，可以接受所有的子类对象
//多态的弊端是什么？
//不能调用子类的特有方法
//引用数据类型的类型转换，有几种方式？
//自动类型转换 Person p = new Student();
//强制类型转换 Student s = (Student) p;
//强制类型转换能解决什么问题？
//可以转换成真正的子类类型，从而调用子类独有功能
//转换类型与真实对象类型不一致会报错
//转换的时候用instanceof关键字进行判断
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();//狗吃骨头

        //多态的弊端
        //不能调用子类的特有功能
        //报错原因？
        //当调用成员方法的时候，编译看左边，执行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错
        //a.lookHome();

        //解决方法：
        //变回子类类型就可以了
        //细节：转换的时候不能瞎转，如果转成其他类的类型，就会报错（利用instanceof）
        //Dog d = (Dog) a;
        //d.lookHome();//狗看家
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else {
            System.out.println("没有这个类型，无法转换");
        }
        //新特性（JDK14以后）
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if (a instanceof Dog d) {
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("没有这个类型，无法转换");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("动物在吃饭");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}