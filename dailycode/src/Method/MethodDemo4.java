package Method;

public class MethodDemo4 {
    //方法的重载:在同一个类中，方法名相同，方法的参数不同，被称为方法的重载(与方法的返回值无关)
    //参数不同:个数不同，类型不同，顺序不同
    //个数不同
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }

    //类型不同
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    //顺序不同
    public static void fn(int a, double b) {
        //语句体
    }

    public static void fn(double a, int b) {
        //
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(30, 80));
        //后面略
    }
}
