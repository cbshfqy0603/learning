package Method;

public class MethodTest2 {
    public static void main(String[] args) {
        getArea(6.98);
    }

    public static void getArea(double r) {
        double result = r * r * 3.14;
        System.out.println("该圆的面积为:" + result);
    }
}
