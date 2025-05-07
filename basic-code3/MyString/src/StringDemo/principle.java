package StringDemo;
//扩展底层原理1：字符串存储的内存原理
//（1）直接赋值会复用字符串常量池中的
//（2）new出来不会复用，而是开辟一个新的空间
//扩展底层原理2：==号比较的到底是什么？
//（1）基本数据类型比较数据值
//（2）引用数据类型比较地址值
//扩展底层原理3：字符串拼接的底层原理（要多用StringBuilder）
//（1）如果没有变量参与，都是字符串直接相加，编译之后就是拼接之后的结果，会复用串池中的结果
//（2）如果有变量参与，会创建新的字符串，浪费内存（无论是JDK8之前还是JDK8之后都会创建字符串，浪费内存）
//扩展底层原理4：StringBuilder提高效率原理图
//所有要拼接的内容都会往StringBuilder中放，不会创建很多无用的空间，节约空间
//扩展底层原理5：（相关实例代码请看StringBuilderDemo包下面的StringBuilderDemo6）
//（1）默认创建一个长度为16的字节数组
//（2）添加的内容长度小于16，直接存
//（3）添加的内容长度大于16会扩容（原来容量*2 + 2）
public class principle {
    public static void main(String[] args) {
        String s1 = "abc";//记录串池中的地址值
        String s2 = "ab";
        String s3 = s2 + "c";//新new出来的对象
        System.out.println(s1 == s3); //false
        //重点（同时也是对于拓展底层原理3的补充说明）
        //字符串拼接时，如果有变量：
        //JDK8以前：系统底层会自动创建一个StringBuilder对象，然后再调用其append方法完成拼接
        //拼接后，再调用其toString方法转换为String类型，而toString方法的底层是直接new了一个字符串对象
        //JDK8版本及以后：
        //系统会预估哟啊字符串拼接之后的总大小，把要拼接的内容放在数组之中，此时也是产生了以恶搞新的字符串
        String s4 = "abc";
        String s5 = "a" + "b" + "c";
        System.out.println(s4 == s5);//true
        //没有变量参与，在编译的时候就会将"a" + "b" + "c"拼接为"abc"，在正式执行的时候就只相当于直接复用

    }
}
