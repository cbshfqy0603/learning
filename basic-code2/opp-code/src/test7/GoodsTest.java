package test7;

public class GoodsTest {
    public static void main(String[] args) {
        //利用动态初始化的方法创建数组
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001", "iPhone16Pro 256GB版本不加购AppleCare+", 8990.0, 100);
        Goods g2 = new Goods("002", "iPadAir7 11英寸 256GB版本不加购AppleCare+", 5299, 200);
        Goods g3 = new Goods("003", "Airpod4(ANS)", 1399, 100);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            //i:是索引
            //arr[i]:元素
            Goods goods = arr[i];
            System.out.println("第一件apple商品为" + goods.getId() + ", " + goods.getName() + ", "
                    + goods.getPrice() + ", " + goods.getCount());
        }

    }



}
