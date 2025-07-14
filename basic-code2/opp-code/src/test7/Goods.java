package test7;

public class Goods {
    /*
    定义数组存储3个商品对象
    商品的属性：（1）id （2）名字 （3）价格 （4） 库存
    创建3个商品对象，并把商品对象存储在数组之中
     */
    private String id;
    private String name;
    private double price;
    private int count;
    //快捷键：fn + alt + insert

    public Goods() {
    }
    //快捷键：ctrl + a(全选)，shift + 下键
    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
