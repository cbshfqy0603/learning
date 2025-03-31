package Operator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //逻辑运算符：& | ! ^
        // & (逻辑与)
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println("………………………………");
        // | (逻辑或)
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true
        System.out.println("………………………………");
        // ! (逻辑非)
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println("………………………………");
        // ^ (逻辑非)
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//false
        System.out.println(false ^ true);//false


    }
}
