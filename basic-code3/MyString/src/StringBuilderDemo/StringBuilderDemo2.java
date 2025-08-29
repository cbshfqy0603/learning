package StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //4.public String toString() -> 通过toString()就可以实现把StringBuilder转换为String
        //创建对象
        StringBuilder sb = new StringBuilder();
        //添加对象
        /*sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");*/
        //此处使用链式编程
        sb.append("aaa").append("bbb").append("ccc").append("ddd").reverse().reverse();
        //反转
        //sb.reverse();
        System.out.println(sb);
        //原因：sb是StringBuilder对象，只是用来操纵字符串的容器所以需要把sb变回为字符串对象
        //再把StringBuilder对象变回String对象
        String str = sb.toString();
        System.out.println(str);
    }
}
