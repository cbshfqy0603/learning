package ProcessControl;

public class test5 {
    public static void main(String[] args) {
        /*
        需求：逢七过
        1-100 如果数字里面带数字7或者是7的倍数就直接过
         */
        //利用for循环1-100
        for (int i = 1; i <= 100; i++) {
            //个位有7过 十位有7过 7的倍数过
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
