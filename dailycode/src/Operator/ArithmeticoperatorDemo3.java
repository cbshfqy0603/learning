package Operator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        //隐式转换（自动类型提升）
        //隐式转换的两种规则：
        //（1）取值范围小的和取值范围大的进行运算，小的会先提升为大的再进行运算、
        //（2）byte short char 进行运算的时候都会先提升为int，再就进行运算
        //取值范围从小到大：byte short int long float double
        //什么时候进行转换：数据类型不一样，需要进行转化才能进行运算
        //实例：
        //byte a = 10;
        //byte b = 10;
        //int c = a + b;
        //实例：
        /*int i = 10;
        long j = 100L;
        double d = 20.0;
        double result = i + j + d;*/
        //实例：
        /*byte a = 10;
        short b = 20;
        long c = 100;
        long result = a + b + c;*/
        //如果把一个取值范围大的变量赋值给取值范围小的变量是不允许直接赋值的，那么就一定要进行强转
        //格式：目标数据类型 变量名 = （目标数据类型）被强转的数据
        //实例：
        /*int a = 10;
        byte b = (byte)a;*/
        //实例：
        byte a = 100;
        byte b = 100;
        byte result = (byte) (a + b);
        System.out.println(result);
        //注此处转换的数据过大的化很有可能发生错误，例如把a和b的值都赋值成100再进行转换的话就会发生
    }
}
