package Method;

public class MethodTest1 {
    public static void main(String[] args) {
        //求长方形的周长
        getLength(9.2, 5.7);
    }

    public static void getLength(double len, double wid) {
        double result = (len + wid) * 2;
        System.out.println("长方形的周长为:" + result);
    }
}
