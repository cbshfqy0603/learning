package Operator;

public class ArithmeticoperatorDemo4 {
    public static void main(String[] args) {
        //"+"操作的三种情况：（1）数字相加（2）字符串相加（3）字符相加
        //字符串相加
        //当"+"操作中出现字符串时，"+"就不是算数运算符，而是字符串连接符了
//        System.out.println(3.7 + "abc");//"3.7abc"
//        System.out.println("abc" + true);//"abctrue"
//        System.out.println('中' + "abc" + true);//"中abctrue"
//        int age = 18;
//        System.out.println("我的年龄是" + age + "岁");//我的年龄是18岁
//        System.out.println("我的年龄是" + "age" + "岁");//我的年龄是age岁
//        //连续进行"+"操作时，从左向右依次执行
//        System.out.println(2 + 1 + "abc" + 2 + 1);//"3abc21"
        //字符相加
        //当“字符 + 字符”或者“字符 + 数字”时，会把字符通过ASCll码对应的数字进行计算
        char c = 'a';
        int result = c + 2;
        System.out.println(result);//99,a的ASCll码值是97
    }
}
