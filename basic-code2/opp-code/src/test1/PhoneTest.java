package test1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();
        //给手机的属性赋值
        p.brand = "IPhone16ProMax";
        p.price = 8999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
    }
}
