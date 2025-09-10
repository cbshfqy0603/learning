package Test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        需求:随机产生一个5位的验证码
        要求前4位为大写字母或者小写字母
        最后一位是数字
         */
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            //随机0-51
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        //随机0-9
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}
