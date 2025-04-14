package Test;

public class Test4 {
    public static void main(String[] args) {
       /*
       生成验证码
       内容：可以是小写字母，也可以是大写字母，还可以是数字
       规则：
       长度为5 内容中是四位字母，一位数字
       其中数字只有一位，但是可以出现在任意位置 */
        //利用数组存储52位字母（A - Z \ a - z）
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char)(97 + i);
            } else {
                arr[i] = (char)(65 + i - 26);
            }
        }
        //随机生成4个字母（不区分大小写），并将其拼接在一起
    }
}
