package ProcessControl;

public class Fordemo1 {
    public static void main(String[] args) {
        //从1累加到100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("从1累加到100的结果为:" + sum);
    }
}
