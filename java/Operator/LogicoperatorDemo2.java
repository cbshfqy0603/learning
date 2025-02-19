package Operator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //短路逻辑运算符：&& ||
        // && (短路与)
        //运行结果与单个 & 是一样的
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println("………………………………");
        // || (短路或)
        //运算结果与单个 | 是一样的
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println("………………………………");
        //短路运算符具有短路效果
        //简单理解就是当左边的表达式能确定最终结果的话，右边的式子就不会参与运算了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);//11
        System.out.println(b);//10
    }
}
