package StringJoinerDemo;
//此处的包名假如为StringJoiner会导致自动导包失败
import java.util.StringJoiner;

//StringJoiner概述：
//（1）StringJoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内日那个是可变的
//（2）作用：提高字符串的操作效率，而且代码编写特别简洁
//（3）JDK8出现
public class StringJoinerDemo1 {
    public static void main(String[] args) {
       //StringJoiner的构造方法
        //(1)public StringJoiner(间隔符号) -> 创建一个StringJoin对象，指定拼接时的间隔符号
        //(2)public StringJoiner(间隔符号, 开始符号, 结束符号) -> 创建一个StringJoiner对象，指定拼接时的间隔符号，开始符号，结束符号
        //StringJoiner的成员方法
        //(1)public StringJoiner add(添加的内容) -> 添加数据，并返回对象本身
        //(2)public int length() -> 返回长度（字符出现的个数）
        //(3)pubic String toString() -> 返回一个字符串（该字符串就是拼接后的结果）
        //public StringJoiner(间隔符号)
        //创建对象
        StringJoiner sj = new StringJoiner("---");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //打印
        System.out.println(sj);
    }
}
