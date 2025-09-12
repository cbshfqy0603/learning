package a03oppextends03;
//方法的重写：当父类的方法不能满足子类现在的需求时。需要进行方法重写
//书写格式：在继承体系中，子类出现了和父类中一模一样的方法声明，我们就称子类这个方法是重写的方法
/*
@Override重写注解
（1）@Override是放在重写后的方法上，校验子类重写时语法是否正确
（2）加上注解后如果有红色波浪线，表示语法错误
（3）建议重写方法都加@Override注解，代码安全，优雅
 */
//方法重写的本质：覆盖虚方法表中的方法
public class Test {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.lunch();
        OverseasStudent os = new OverseasStudent();
        os.lunch();
    }
}

class Person {
    public Dog eat() {
        System.out.println("吃米饭");
        return null;
    }
    public void drink() {
        System.out.println("喝茶");
    }
}

class OverseasStudent extends Person {
    public void lunch() {
       this.eat();//嗦面
       this.drink();//喝可乐
       super.eat();//吃米饭
       super.drink();//喝茶
    }
    //方法重写注意事项和要求：
    //（1）重写方法的名称，形参列表必须与父类中的一致
    //（2）子类重写父类方法时，访问权限子类必须大于等于父类（空着不写<protected<public）
    //（3）子类重写父类方法时，返回值类型子类必须小于等于父类
    //（4）建议：直接忽略第三点和第四点，重写的方法尽量和父类保持一致即可
    //（5）只有被添加到虚方法中的方法才能被重写
    //子类的返回值类型比父类大 不满足规则三的返回值类型子类必须小于父类 改成Dog后恢复正常
    @Override
    public Dog eat() {
        System.out.println("嗦面");
        return null;
    }

    @Override
    public void drink() {
        System.out.println("喝可乐");
    }
}

class Student extends Person {
    public void lunch() {
        //先在本类中查看eat和drink方法，就会调用子类的，如果没有，就会调用从父类中继承下来的eat和drink方法
        this.eat();
        this.drink();
        //直接调用父类中的eat和drink方法
        super.eat();
        super.drink();
    }
}