package test8;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //利用动态初始化的方法创建数组
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入车的价格：");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入车的颜色：");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("车的品牌为：" + arr[i].getBrand() +
                    " 车的价格为：" + arr[i].getPrice() + " 车的颜色为："
                    + arr[i].getColor());
        }
    }
}
