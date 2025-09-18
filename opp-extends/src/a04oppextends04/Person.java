package a04oppextends04;
//继承中：构造方法的访问特点
//（1）父类中的构造方法不会被子类继承
//（2）子类中所有的构造方法默认先访问父类中的无参构造，再执行自己
//为什么？
//（1）子类在初始化的时候，有可能会用到父类中的数据，如果父类没有完成初始化，子类将无法使用父类中的数据
//（2）子类在初始化之前，一定要调用父类构造方法先完成父类数据空间的初始化
//怎么调用父类构造方法？
//（1）子类构造方法第一句默认都是：super(); 不写也存在，其必须第一行
//（2）如果调用父类有参构造，必须手写super进行调用
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
