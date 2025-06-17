package a05mystatic;
//public:被JVM调用，访问权限足够大
//static:被JVM调用，不用创建对象，直接类名访问，因为main方法是静态的，所以测试类中其他方法也需要是静态的
//void:被JVM调用，不需要给JVM返回值
//main:一个通用的名称，虽然不是关键字，但是被JVM识别
//String[] args:以前用于接收键盘录入数据的，现在没用
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
