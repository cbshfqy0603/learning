package Operator;

public class AssigningoperatorDemo {
    public static void main(String[] args) {
        //赋值运算符：= += -= *= /= %=
        //规则：把左边和右边进行相加，再把值赋给左边
        //以+=为例子，其余与加等同理
        int a = 10;
        int b = 20;
        //先a + b,再把a + b的值赋值给a
        a += b;
        //相当于a = (int)(a + b)
        System.out.println(a);//30
        System.out.println(b);//20


        //细节：
        //+= -= *= /= %=底层都隐藏了一个强制类型转换
        short s = 1;
        s += 1;
        //相当于s = (short)(s + 1)
        System.out.println(s);

    }
}
