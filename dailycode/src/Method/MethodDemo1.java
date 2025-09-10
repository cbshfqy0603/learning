package Method;

public class MethodDemo1 {
    //方法是程序中最小的执行单元
    //重复的代码，具有独立功能的代码可以抽取到方法中
    //方法的好处:
    //(1)可以提高代码的复用性
    //(2)可以提高代码的可维护性
    //最简单的方法定义和调用
    public static void main(String[] args) {
        System.out.println("a");
        method1();
        System.out.println("x");
    }

    public static void method1() {
        method2();
        System.out.println("h");
    }

    public static void method2() {
        System.out.println("y");
        System.out.println("s");
    }
}
