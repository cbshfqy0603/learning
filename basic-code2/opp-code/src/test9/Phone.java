package test9;

public class Phone {
    //定义数组存储三个手机对象
    //手机的属性：（1）品牌 （2）价格 （3）颜色
    private String brand;
    private int price;
    private String color;

    public Phone() {

    }
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
