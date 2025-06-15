package Method;

public class MethodDemo3 {
    //带返回值的方法定义和调用
    //调用处要根据方法的结果来编写代码，那么此时就需要用到带返回值的方法的定义和调用
    public static void main(String[] args) {
        //三种调用方式:
        //直接调用
        //getSum(10, 20, 30);
        //赋值调用
        //int sum1 = getSum(10, 20, 30);
        //输出调用
        //System.out.println(getSum(10, 20, 30));
        //第一季度的营业额
        int sum1 = getSum(10, 20, 30);
        //第二季度的营业额
        int sum2 = getSum(20, 30, 40);
        //第三季度的营业额
        int sum3 = getSum(20, 20, 25);
        //第四季度的营业额
        int sum4 = getSum(30, 35, 25);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println("这一整年公司的营业额为:" + sum + "亿");

    }

    public static int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
    /*
    方法的注意事项:
    (1)方法不调用就不执行
    (2)方法与方法之间是平级关系，不能互相嵌套定义
    (3)方法的执行顺序与方法的编写顺序无关
    (4)方法的返回值类型是void,表示该方法没有返回值，没有返回值的方法return可以省略不写，如果执意要
    写return后面不能接任何东西
    (5)return 语句下面不能编写代码，因为永远执行不到
     */
}
