package StringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        //添加元素
        sj.add("a").add("b").add("c");
        //打印结果
        System.out.println(sj);
        //获取长度（所有字符的个数包括间隔符号、开始符号、结束符号）
        int len = sj.length();
        System.out.println("长度为：" + len);
        //将StringJoiner类转换为String类
        String str = sj.toString();
        System.out.println(str);
    }
    //总结：
    //String：表示字符串的类，定义了很多操作字符串的方法
    //StringBuilder:
    //（1）一个可变的操作字符串的容器
    //（2）可以高效的拼接字符串，还可以将容器里面的内容反转
    //StringJoiner:
    //（1）JDK8出现的一个可变的操作字符串的容器，可以高效、方便的拼接字符串
    //（2）在拼接的时候，可以指定间隔符号，开始符号，结束符号
}
