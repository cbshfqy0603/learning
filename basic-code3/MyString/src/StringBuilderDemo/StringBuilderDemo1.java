package StringBuilderDemo;
//StringBuilder概述；
//StringBuilder对象可以看作一个容器，创建之后里面的内容是可变的
//作用：提高字符串的操作效率
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //StringBuilder构造方法
        //public StringBuilder() -> 创建一个空白的可变字符串内容
        //public StringBuilder(String str) -> 根据字符串的内容，来创建可变字符串对象
        //创建StringBuilder对象
        //调用空参构造
        //StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("abc");
        //StringBuilder的常用方法
        //（1）public StringBuilder append(任意类型) -> 添加数据，并返回对象本身
        //（2）public StringBuilder reverse() -> 反转容器中的内容
        //（3）public int length() -> 返回长度（字符出现的个数）
        //1.添加数据
        /*sb.append(11);
        sb.append(12.3);
        sb.append(true);
        sb.append("ABC");
        sb.append('D');*///abc1112.3trueABCD
        //2.反转
        //在进行添加数据和反转数据有关方法的学习后，可以发现，StringBuilder对象和String对象不同
        //String对象一经创建，其中的内容是不可变的，但是StringBuilder对象的内容是可变的
        //对于String对象调用截取方法，替换方法等方法后只有返回值才是改变之后的本身并未发生改变，而StringBuilder是本身发生改变
        sb.reverse();//cba
        //3.获取长度
        int length = sb.length();
        System.out.println("长度为：" + length);

        //打印
        //普及；
        //StringBuilder是Java中已经写好的类(String也同理)
        //java在底层对它进行了一些特殊处理
        //打印的不是地址值，而是属性值
        System.out.println(sb);


    }
}
