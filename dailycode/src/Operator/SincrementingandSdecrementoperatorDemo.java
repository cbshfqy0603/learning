package Operator;

public class SincrementingandSdecrementoperatorDemo {
    public static void main(String[] args) {
        //自增自减运算符：（1）单独使用（2）参于运算
        //(1)单独使用
        //++ --无论写在变量的前面和后面，单独写一行结果是一样的
//        int a = 10;
//        //变量a的值+1
//        a++;
//        System.out.println(a);//11
//        //变量a的值+1
//        ++a;
//        System.out.println(a);//12
//        //变量a的值-1
//        a--;
//        System.out.println(a);//11
//        //变量a的值-1
//        --a;
//        System.out.println(a);//10
        //(2)参与运算
        int x = 10;
        int y = ++x;//先使用再赋值
        int z = x++;//先赋值再使用
        System.out.println(x);//12
        System.out.println(y);//11
        System.out.println(z);//11

    }
}
