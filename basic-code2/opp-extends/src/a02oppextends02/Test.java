package a02oppextends02;
//继承中成员变量的访问特点：就近原则
//先在局部位置找。本类成员位置找，父类成员位置找，逐级往上(直接调用)
//this 先到到本类成员位置，父类成员位置找，逐级往上
//super 直接到父类成员位置找
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}
class Ye {
    String name = "Ye";
}
class Fu extends Ye {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";
    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);//ziShow
        System.out.println(this.name);//Zi
        System.out.println(super.name);//Fu
        //...Ye??
        //System.out.println(super.super.name); 没有这种写法 不能连续调用两个super
    }
}