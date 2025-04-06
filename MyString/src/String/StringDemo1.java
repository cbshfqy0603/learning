package String;
/*
API：目前是JDK中提供各种功能的java类
这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类如何使用即可
API帮助文档：帮助开发人员更好的使用API和查询API的一个工具
String概述：
（1）String是java定义好的一个类，定义在java.lang包中，所以使用的时候不需要导包
（2）java程序中的所有字符串文字（例如："abcdefg"）都被视为此类的对象
（3）字符串不可变，他们的值在创建后不可更改
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //创建String对象的两种方式：
        //（1）使用直接赋值的方式来获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);//abc
        //（2）使用new关键字 + 构造方法
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");//@!
        //传递一个字符串，根据传递的字符串的内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);//abc
        //传递一个字符数组，根据传递的字符数组的内容再创建一个新的字符串对象
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);//abcd
        //传递一个字节数组，根据传递的字节数组的内容在创建一个字符串对象
        byte[] bytes = {97, 98, 99, 100};
        //byte[] bytes = {65, 66, 67, 68};
        String s5 = new String(bytes);
        System.out.println(s5);//abcd ABCD

    }
}

