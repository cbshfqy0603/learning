package Method;

public class MethodDemo2 {
    //带参数的方法定义和调用
    public static void main(String[] args) {
        //实参:全称实际参数，是指在方法调用中的参数
        getSum(10, 20);
        int a = 10;
        int b = 10;
        //实参
        getSum(a, b);
    }

    //形参:全称形式参数，是指在方法定义中的参数
    public static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
