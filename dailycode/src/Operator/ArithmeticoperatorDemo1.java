package Operator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(4 + 5);
        //-
        System.out.println(10 - 6);
        //*
        System.out.println(9 * 3);
        //如果小数参与运算结果可能是不精确的
        System.out.println(1.1 + 1.1);//此结果是精确的
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
