package StringBuilderDemo;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        //创建StringBuilder()对象
        StringBuilder sb = new StringBuilder();
        //容量(capacity):最多装了多少
        //长度(length):已经装了多少
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0
        //abcdefghijklmnopqrstuvwsyz
        //abcdefghijklmnopqrstuvwsyz0123456789
        sb.append("abcdefghijklmnopqrstuvwsyz");
        System.out.println(sb.capacity());//34  36
        System.out.println(sb.length());//26  36
    }

}
