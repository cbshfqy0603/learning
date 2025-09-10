package Operator;

public class TernaryoperatorDemo {
    public static void main(String[] args) {
        //三元表达式
        //格式：关系表达式 ? 表达式1 ：表达式2
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println(a > b ? a : b);
    }
}
